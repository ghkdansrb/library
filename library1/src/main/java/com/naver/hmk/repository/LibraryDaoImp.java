package com.naver.hmk.repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.naver.hmk.domain.Member;

@Repository
public class LibraryDaoImp implements LibraryDao{
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	final String LIBRARY_NS = "com.naver.hmk.LibraryMapper";

	@Override
	public int insertMember(Member member) {
		// TODO Auto-generated method stub
		return sqlSession.insert(LIBRARY_NS+".memberAdd",member);
	}


}
