package com.naver.hmk.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.naver.hmk.service.LibraryService;

@Controller
public class LibraryController {
	@Autowired
	private LibraryService libraryService;
	
	@RequestMapping(value="/memberAdd" , method=RequestMethod.GET)
	public String memberAdd(){
		return "/library/member";
	}
	
	@RequestMapping(value="/bookAdd", method=RequestMethod.GET)
	public String bookAdd(){
		return "/library/book";
	}
	
	
	
}
