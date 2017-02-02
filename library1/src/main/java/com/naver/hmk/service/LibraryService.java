package com.naver.hmk.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naver.hmk.domain.Admin;
import com.naver.hmk.domain.Book;
import com.naver.hmk.domain.Category;
import com.naver.hmk.domain.Local;
import com.naver.hmk.domain.Member;
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
	
}
