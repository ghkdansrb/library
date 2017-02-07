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
import org.springframework.web.servlet.ModelAndView;

import com.naver.hmk.domain.Admin;
import com.naver.hmk.domain.Book;
import com.naver.hmk.domain.Category;
import com.naver.hmk.domain.Member;
import com.naver.hmk.domain.Payment;
import com.naver.hmk.domain.Rental;
import com.naver.hmk.service.LibraryService;

@Controller
public class LibraryController {
	@Autowired
	private LibraryService libraryService;
	
	//폐기도서등록
	@RequestMapping(value="/bookDiscard")
	public String bookDiscard(
		@RequestParam(value="bookNo") int bookNo){
		libraryService.discardBookAdd(bookNo);
		return "redirect:/bookList";
	}

	//결제리스트
	@RequestMapping(value="/paymentList", method=RequestMethod.GET)
	public String paymentList(Model model){
		List<Payment> list = libraryService.paymentList();
		model.addAttribute("list", list);
		return "/library/paymentList";
	}
	//대여리스트
	@RequestMapping(value="/rentalList", method=RequestMethod.GET)
	public String rentalList(Model model){
		List<Rental> list = libraryService.rentalList();
		model.addAttribute("list", list);
		return "/library/rentalList";
	}
	//반납신청
	@RequestMapping(value="/return", method=RequestMethod.GET)
	public String returns(){
		return "/library/return";
	}
	//반납신청
	@RequestMapping(value="/return", method=RequestMethod.POST)
	public String returns(
			@RequestParam(value="totalPrice")int totalPrice,
			@RequestParam(value="bookNo")int bookNo,
			@RequestParam(value="memberNo")int memberNo
			){
		libraryService.bookReturn(bookNo, memberNo, totalPrice);
		
		return "redirect:/paymentList";
	}
	
	//대여검색 searchRental
	@RequestMapping(value="/searchRental")
	public ModelAndView searchRental(
			@RequestParam(value="bookNo")int bookNo){
		ModelAndView mv = new ModelAndView("jsonView");
		Map<String, Object> map = libraryService.searchRental(bookNo);
		mv.addObject("book", map.get("book"));
		mv.addObject("rental", map.get("rental"));
		mv.addObject("member", map.get("member"));
		mv.addObject("totalPrice", map.get("totalPrice"));
		return mv;
	}	
	
	
	//대여등록
	@RequestMapping(value="/rentalAdd", method=RequestMethod.POST)
	public String rentalAdd(Rental rental,
			@RequestParam(value="prepayment") int prepayment){
		int result = libraryService.rentalAdd(rental, prepayment);
		System.out.println("대여등록확인"+result);
		if(result>0){
			return "redirect:/rentalList";
		}else{
			return "/library/rentalAdd";
		}
	}
	@RequestMapping(value="/rentalAdd", method=RequestMethod.GET)
	public String rentalAdd(){
		
		return "/library/rentalAdd";
	}
	
	//대여를위한 도서검색
	@RequestMapping(value="/searchBook")
	public ModelAndView searchBook(
			@RequestParam(value="bookNo") int bookNo){
		ModelAndView mv = new ModelAndView("jsonView");
		Book book = libraryService.searchBook(bookNo);
		mv.addObject("book", book);
		return mv;
	}	
	
	//대여를 위한 회원검색
	@RequestMapping(value="/searchMember")
	public ModelAndView searchMember(
			@RequestParam(value="memberNo")int memberNo){
		ModelAndView mv = new ModelAndView("jsonView");
		Member member = libraryService.searchMember(memberNo);
		mv.addObject("member", member);
			return mv;
	}	
	
	
	//도서삭제
	@RequestMapping(value="/bookRemove")
	public String bookRemove(Book book){
		int result = libraryService.bookRemove(book);
		if(result == 1){
			return "redirect:/bookList";
		}else{
			return "redirect:/bookView?bookNo="+book.getBookNo();
		}
	}
	//도서수정
	@RequestMapping(value="/bookModify", method=RequestMethod.POST)
	public String bookUpdate(Book book) {
		int result = libraryService.bookUpdate(book);
		if(result == 1){
			return "redirect:/bookView?bookNo="+book.getBookNo();
		}else{
			return "redirect:/bookModify?bookNo="+book.getBookNo();
		}
	}
	//도서상세
	@RequestMapping(value="/bookView")
	public String bookView(Model model, 
			@RequestParam(value="bookNo") int bookNo){
		System.out.println(bookNo);
		model.addAttribute("book", libraryService.selectOneBook(bookNo));
		return "/library/bookView";
		
	}
	//도서리스트
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
	//회원리스트
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
	//회원등록
	@RequestMapping(value="/memberAdd" , method=RequestMethod.GET)
	public String memberAdd(){
			
		return "/library/memberAdd";
	}
	//회원등록	
	@RequestMapping(value="/memberAdd" , method=RequestMethod.POST)
	public String memberAdd(Member member){
		System.out.println("회원들어오냐?"+member);
		libraryService.MemberAdd(member);
		return "redirect:/memberList";
	}
	//도서등록
	@RequestMapping(value="/bookAdd", method=RequestMethod.GET)
	public String bookAdd(Model model){
		List<Category> categoryList = libraryService.categoryList();
			model.addAttribute("categoryList", categoryList);
		return "/library/bookAdd";
	}
	//도서등록
	@RequestMapping(value="/bookAdd", method=RequestMethod.POST)
	public String bookAdd(Book book, HttpSession session){
		Map<String, Object> sessionMap = (Map<String, Object>) session.getAttribute("admin");
		int sessionLibraryNo = (Integer) sessionMap.get("sessionLibraryNo");
			book.setLibraryNo(sessionLibraryNo);
			libraryService.BookAdd(book);
			System.out.println("책들어오냐?"+book);
		return "redirect:/bookList";
	}
	//로그인
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(){

		return "/library/login";
	}
	//로그인체크
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
	//로그아웃
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request){
	   request.getSession().invalidate();
	   
	   return "redirect:/login";
	}
	//홈화면요청
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String home(){
		return "/library/home";
		
	}
	
	/**
	 * 가상의 로그인체크 컨트롤러
	 * @param request
	 * @return
	 */

}
