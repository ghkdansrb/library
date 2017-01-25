package com.naver.hmk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naver.hmk.domain.Member;
import com.naver.hmk.repository.LibraryDao;

@Service
public class LibraryServiceImp implements LibraryService{
	@Autowired
	private LibraryDao libraryDao;

	@Override
	public int MemberAdd(Member member) {
		// TODO Auto-generated method stub
		return libraryDao.insertMember(member);
	}
}
