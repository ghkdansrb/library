<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<div class="container-fluid">

  	<!-- 사이드바 -->
    <nav class="col-sm-3 sidenav">
      <h4>회원관리</h4>
      <ul class="nav nav-pills nav-stacked">
        <li><a href="memberAdd">회원등록</a></li>
        <li><a href="memberList">회원목록</a></li>
        <h4>도서관리</h4>
        <li><a href="bookAdd">도서등록</a></li>
        <li><a href="bookList">도서목록</a></li>
        <h4>대여/반납</h4>
        <li><a href="rentalAdd">대여신청</a></li>
        <li><a href="return">반납신청</a></li>
      </ul>
    </nav>
	<!-- 사이드바 끝 -->

<!-- Overlay effect when opening sidenav on small screens -->
<div class="w3-overlay w3-hide-large" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>

<!-- Main content: shift it to the right by 250 pixels when the sidenav is visible -->
<div class="w3-main" style="margin-left:250px">