<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>W3.CSS Template</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
<link rel="stylesheet" href="http://www.w3schools.com/lib/w3-theme-black.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
    /* 사이드바 */
    .sidenav {
      background-color: #f1f1f1;
      position: fixed;
      width: 200px;
      height: 100%;
      margin-left: -20px;
      margin-top:50px
    }
    /* 본문 */
    .page {
     margin-top:50px;
     margin-left: 250px;
    }

    /* footer */
    footer {
      background-color: #555;
      color: white;
      padding: 15px;
    }

</style>

<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="home">Smart Library</a>
    </div>
    <ul class="nav navbar-nav">

     <li class="active"><a href="home">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">회원관리 <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="memberAdd">회원등록</a></li>
          <li><a href="memberList">회원목록</a></li>
        </ul>
      </li>

      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">도서관리 <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="bookAdd">도서등록</a></li>
          <li><a href="bookList">도서목록</a></li>
        </ul>
      </li>

      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">대여/반납 <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="rentalAdd">대여신청</a></li>
          <li><a href="rentalList">대여목록</a></li>
          <li><a href="return">반납신청</a></li>
          <li><a href="paymentList">결제목록</a></li>
        </ul>
      </li>

    </ul>
    <ul class="nav navbar-nav navbar-right">
		<li><span style="color:#ffffff">${admin.sessionLibraryName}</span></li>
		<li><span style="color:#ffffff">${admin.sessionName} 로그인중</span></li>
		<li><a href="logout"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
    </ul>
  </div>
</nav>
