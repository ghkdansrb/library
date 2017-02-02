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

}
