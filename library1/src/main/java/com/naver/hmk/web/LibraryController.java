package com.naver.hmk.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.naver.hmk.domain.Admin;
import com.naver.hmk.domain.Book;
import com.naver.hmk.domain.Category;
import com.naver.hmk.domain.Member;
import com.naver.hmk.service.LibraryService;

@Controller
public class LibraryController {
	@Autowired
	private LibraryService libraryService;
	
	@RequestMapping(value="/bookModify", method=RequestMethod.POST)
	public String bookUpdate(Book book) {
		return "redirect:/bookView?bookNo="+book.getBookNo();
		
	}
	
	@RequestMapping(value="/bookView")
	public String bookView(Model model, 
			@RequestParam(value="bookNo") int bookNo){
		System.out.println(bookNo);
		model.addAttribute("book", libraryService.selectOneBook(bookNo));
		return "/library/bookView";
		
	}
	
	@RequestMapping(value="/bookList")
	public String bookList(Model model,
			@RequestParam(value="currentPage", defaultValue="1") int currentPage){
		Map<String, Object> returnMap 
			= libraryService.getBookListCurrntPerPage(currentPage);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("totalRowCount", returnMap.get("totalRowCount"));
		model.addAttribute("lastPage", returnMap.get("lastPage"));
		model.addAttribute("list", returnMap.get("list"));
		System.out.println("리스트오냐?"+model.toString());
		return "/library/bookList";
	}
	
	@RequestMapping(value="/memberList")
	public String memberList(Model model,
			@RequestParam(value="currentPage", defaultValue="1") int currentPage){
		Map<String, Object> returnMap 
			= libraryService.getMemberListCurrntPerPage(currentPage);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("totalRowCount", returnMap.get("totalRowCount"));
		model.addAttribute("lastPage", returnMap.get("lastPage"));
		model.addAttribute("list", returnMap.get("list"));
		System.out.println("리스트오냐?"+model.toString());
		return "/library/memberList";
	}
	
	@RequestMapping(value="/memberAdd" , method=RequestMethod.GET)
	public String memberAdd(){
			
		return "/library/memberAdd";
	}
		
	@RequestMapping(value="/memberAdd" , method=RequestMethod.POST)
	public String memberAdd(Member member){
		System.out.println("회원들어오냐?"+member);
		libraryService.MemberAdd(member);
		return "/library/memberAdd";
	}
	
	@RequestMapping(value="/bookAdd", method=RequestMethod.GET)
	public String bookAdd(Model model){
		List<Category> categoryList = libraryService.categoryList();
			model.addAttribute("categoryList", categoryList);
		return "/library/bookAdd";
	}
	
	@RequestMapping(value="/bookAdd", method=RequestMethod.POST)
	public String bookAdd(Book book, HttpSession session){
		Map<String, Object> sessionMap = (Map<String, Object>) session.getAttribute("admin");
		int sessionLibraryNo = (Integer) sessionMap.get("sessionLibraryNo");
			book.setLibraryNo(sessionLibraryNo);
			libraryService.BookAdd(book);
			System.out.println("책들어오냐?"+book);
		return "/library/bookAdd";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(){

		return "/library/login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(HttpSession session, @RequestParam(value="id") String id, @RequestParam(value="password") String password){
	    Admin admin = libraryService.loginCheck(id, password);
	    //웹페이지에서받은 아이디,패스워드 일치시 admin 세션key 생성
	    if(admin!=null) {
	        Map<String, Object> map = new HashMap<String,Object>();
	        map.put("sessionId", admin.getAdminId());
	        map.put("sessionName", admin.getAdminName());
	        map.put("sessionLibraryNo", admin.getLibraryNo());
	        map.put("sessionLibraryName", admin.getLibraryName());
	        session.setAttribute("admin", map);
	     return "redirect:/home";
	    
	}
	    //일치하지 않으면 로그인페이지 재이동
	    return "redirect:/login";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request){
	   request.getSession().invalidate();
	   
	   return "redirect:/login";
	}
		
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String home(){
		return "/library/home";
		
	}
	
	@RequestMapping(value="/rental", method=RequestMethod.GET)
	public String rental(){
		return "/library/rental";
	}
	
	@RequestMapping(value="/return", method=RequestMethod.GET)
	public String returns(){
		return "/library/return";
	}
	
	/**
	 * 가상의 로그인체크 컨트롤러
	 * @param request
	 * @return
	 */

	  

	

}
