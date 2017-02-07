package com.naver.hmk.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.naver.hmk.domain.Admin;
import com.naver.hmk.domain.Book;
import com.naver.hmk.domain.Category;
import com.naver.hmk.domain.Local;
import com.naver.hmk.domain.Member;
import com.naver.hmk.domain.Payment;
import com.naver.hmk.domain.Rental;
import com.naver.hmk.repository.LibraryDao;

@Service
public class LibraryService{
	@Autowired
	private LibraryDao libraryDao;
	//관리자 로그인체크
	public Admin loginCheck(String id, String password){
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", id);
		map.put("password", password);
		return libraryDao.loginCheck(map);
	}
	//도서추가
	public int BookAdd(Book book) {
		return libraryDao.insertBook(book);
	}
	//회원추가
	public int MemberAdd(Member member) {
		// TODO Auto-generated method stub
		return libraryDao.insertMember(member);
	}
	//카테리스트
	public List<Category> categoryList(){
		return libraryDao.categoryList();
	}
	//지역리스트
	public List<Local> localList(){
		return libraryDao.localList();
	}
	//회원리스트(페이징작업)
	public Map<String, Object> getMemberListCurrntPerPage(int currentPage){
		//pagePerRow(보여줄행수), beginRow(비긴로우행부터 pagePerRow까지)
		int pagePerRow = 10;
		int beginRow=(currentPage-1)*pagePerRow;
		
		//totalCount (전체행수)
		int totalRowCount = libraryDao.selectTotalMemberCount();
		
		//lastPage
		int lastPage = totalRowCount/pagePerRow;
		if(totalRowCount%pagePerRow != 0) {
			lastPage++;
		}
		
		//memberList
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("beginRow", beginRow);
		map.put("pagePerRow", pagePerRow);
		List<Member> list = libraryDao.selectMemberListPerPage(map);
		Map<String, Object> returnMap = new HashMap<String, Object>();
		returnMap.put("totalRowCount", totalRowCount);
		returnMap.put("lastPage", lastPage);
		returnMap.put("list", list);

		return returnMap;
	}
	
	//도서리스트(페이징작업)
	public Map<String, Object> getBookListCurrntPerPage(int currentPage){
		//pagePerRow(보여줄행수), beginRow(비긴로우행부터 pagePerRow까지)
		int pagePerRow = 10;
		int beginRow=(currentPage-1)*pagePerRow;
		
		//totalCount (전체행수)
		int totalRowCount = libraryDao.selectTotalBookCount();
		
		//lastPage
		int lastPage = totalRowCount/pagePerRow;
		if(totalRowCount%pagePerRow != 0) {
			lastPage++;
		}
		
		//bookList
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("beginRow", beginRow);
		map.put("pagePerRow", pagePerRow);
		List<Book> list = libraryDao.selectBookListPerPage(map);
		Map<String, Object> returnMap = new HashMap<String, Object>();
		returnMap.put("totalRowCount", totalRowCount);
		returnMap.put("lastPage", lastPage);
		returnMap.put("list", list);

		return returnMap;
	}
	// 북상세보기
	public Book selectOneBook(int bookNo){
		return libraryDao.selectOneBook(bookNo);
		
	}
	// 도서수정하기
	public int bookUpdate(Book book){
		return libraryDao.bookUpdate(book);
	}
	// 도서삭제하기
	public int bookRemove(Book book) {
		return libraryDao.bookRemove(book);
	}
	
	//대여를 위한 도서 검색
	public Book searchBook(int bookNo){
		return libraryDao.searchBook(bookNo);
	}
	//대여를 위한 회원검색
	public Member searchMember(int memberNo){
		return libraryDao.searchMember(memberNo);
	}
	

	//대여등록
	@Transactional
	public int rentalAdd(Rental rental, int prepayment){
		int paymentInsert= 0;
		//대여테이블에 등록
		int rentalAddResult = libraryDao.rentalAdd(rental);
		//만약 대여테이블에 등록이 성공하면
		if(rentalAddResult>0){
			//해당도서의 totalCount를 가져온다
			int selectRentalCount = libraryDao.selectRentalCount(rental.getBookNo());
			//book객체를 생성하고
			Book book = new Book();
			//bookNo와 totalcount(아까 select한 totalCount)를 객체에 담는다.
			book.setBookNo(rental.getBookNo());
			book.setBookTotalrental(selectRentalCount);
			//도서상태를 업데이트
			int updateResult = libraryDao.bookRentalstateUpdate(book);
			//만약에 도서업데이트가 성공하면
			if(updateResult >0){
				//결제를 등록
				
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("memberNo", rental.getMemberNo());
				map.put("bookNo", rental.getBookNo());
				map.put("prepayment", prepayment);					
				paymentInsert = libraryDao.paymentInsert(map);
				//성공했는지 안헀는지 결과값 반환
				return paymentInsert;
			}
		}
		//실패
		return paymentInsert;
	}
	
	//반납신청
	@Transactional
	public Map<String, Object> searchRental(int bookNo){
		Map<String, Object> map = new HashMap<String, Object>();
		//도서 검색
		Book book = libraryDao.searchBook(bookNo);
		//대여검색
		Rental rental = libraryDao.searchRental(bookNo);
		//회원검색
		Member member = libraryDao.searchMember(rental.getMemberNo());
		//결제금액검색
		int totalPrice = libraryDao.totalPrice(rental);
		map.put("book", book);
		map.put("rental", rental);
		map.put("member", member);
		map.put("totalPrice", totalPrice);
		return map;
	}
	//반납처리
	@Transactional
	public int bookReturn(int bookNo, int memberNo, int totalPrice){
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("bookNo", bookNo);
		map.put("memberNo", memberNo);
		map.put("totalPrice", totalPrice);		
		
		libraryDao.returnAndPayment(map);
		libraryDao.bookReturnstateUpdate(bookNo);
		
		return libraryDao.rentalstateUpdate(bookNo); 	
	}
	//대여리스트
	public List<Rental> rentalList(){
		return libraryDao.rentalList();
	}
	//결제리스트
	public List<Payment> paymentList(){
		return libraryDao.paymentList();
	}
	//도서폐기등록을하기위한 도서상태수정
	public int discardBookAdd(int bookNo){
		return libraryDao.discardBookAdd(bookNo);
	}

}
