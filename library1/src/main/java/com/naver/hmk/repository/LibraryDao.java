package com.naver.hmk.repository;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.naver.hmk.domain.Admin;
import com.naver.hmk.domain.Book;
import com.naver.hmk.domain.Category;
import com.naver.hmk.domain.Local;
import com.naver.hmk.domain.Member;
import com.naver.hmk.domain.Payment;
import com.naver.hmk.domain.Rental;

@Repository
public class LibraryDao{
	@Autowired
	private SqlSessionTemplate sqlSession;
	final String LIBRARY_NS = "LibraryMapper";
	
	//관리자로그인
	public Admin loginCheck(Map<String, String> map){
		return sqlSession.selectOne(LIBRARY_NS+".loginCheck", map);
	}
	//도서추가
	public int insertBook(Book book) {
		return sqlSession.insert(LIBRARY_NS+".bookAdd",book);
	}
	//회원추가
	public int insertMember(Member member) {
		// TODO Auto-generated method stub
		return sqlSession.insert(LIBRARY_NS+".memberAdd",member);
	}
	//도서카테고리리스트
	public List<Category> categoryList(){
		return sqlSession.selectList(LIBRARY_NS+".categoryList");
	}
	//지역리스트
	public List<Local> localList(){
		return sqlSession.selectList(LIBRARY_NS+".localList");
	}
	//멤버카운트
	public int selectTotalMemberCount(){
		return sqlSession.selectOne(LIBRARY_NS+".selectTotalMemberCount");
	}
	//멤버리스트
	public List<Member> selectMemberListPerPage(Map<String, Integer> map){
		return sqlSession.selectList(LIBRARY_NS+".selectMemberListPerPage", map);
	}
	//북카운트
	public int selectTotalBookCount(){
		return sqlSession.selectOne(LIBRARY_NS+".selectTotalBookCount");
	}
	//도서리스트
	public List<Book> selectBookListPerPage(Map<String, Integer> map){
		return sqlSession.selectList(LIBRARY_NS+".selectBookListPerPage", map);
	}
	//북상세보기
	public Book selectOneBook(int bookNo){
		return sqlSession.selectOne(LIBRARY_NS+".selectOneBook",bookNo);
	}
	//도서수정
	public int bookUpdate(Book book){
		return sqlSession.update(LIBRARY_NS+".bookUpdate", book);
	}
	//도서삭제
	public int bookRemove(Book book){
		return sqlSession.delete(LIBRARY_NS+".bookRemove", book);
	}
	//대여를 위한 도서 검색
	public Book searchBook(int bookNo){
		return sqlSession.selectOne(LIBRARY_NS+".searchBook", bookNo);
	}
	//대여를 위한 회원검색
	public Member searchMember(int memberNo){
		return sqlSession.selectOne(LIBRARY_NS+".searchMember", memberNo);
	}
	//대여등록
	public int rentalAdd(Rental rental){
		return sqlSession.insert(LIBRARY_NS+".rentalAdd", rental);
	}
	//대여등록후 대여상태와 토탈카운트 증가
	public int bookRentalstateUpdate(Book book){
		return sqlSession.update(LIBRARY_NS+".bookRentalstateUpdate", book);
	}
	//총대여횟수를 확인하기
	public int selectRentalCount(int bookNo){
		return sqlSession.selectOne(LIBRARY_NS+".selectRentalCount", bookNo);
	}
	//결제등록
	public int paymentInsert(Map<String, Object> map){
		return sqlSession.insert(LIBRARY_NS+".paymentInsert", map);
	}
	//대여검색
	public Rental searchRental(int bookNo){
		return sqlSession.selectOne(LIBRARY_NS+".searchRental", bookNo);
	}
	//결제금액계산
	public int totalPrice(Rental rental){
		return sqlSession.selectOne(LIBRARY_NS+".totalPrice", rental);
	}
	//반납을 위한 결제
	public int returnAndPayment(Map<String, Integer> map){
		return sqlSession.update(LIBRARY_NS+".returnAndPayment", map);
		
	}
	//반납신청후 반납일자등록
	public int rentalstateUpdate(int bookNo){
		return sqlSession.update(LIBRARY_NS+".rentalstateUpdate", bookNo);
	}
	//반납신청후 도서상태변경
	public int bookReturnstateUpdate(int bookNo){
		return sqlSession.update(LIBRARY_NS+".bookReturnstateUpdate", bookNo);
	}
	//대여리스트
	public List<Rental> rentalList(){
		return sqlSession.selectList(LIBRARY_NS+".rentalList");
	}
	//결제리스트
	public List<Payment> paymentList(){
		return sqlSession.selectList(LIBRARY_NS+".paymentList");
	}
	//도서폐기등록을하기위한 도서상태수정
	public int discardBookAdd(int bookNo){
		return sqlSession.update(LIBRARY_NS+".discardBookAdd", bookNo);
	}
	//도서폐기등록
	public int discardBook(){
		return sqlSession.delete(LIBRARY_NS+".discardBook");
	}
	
}
