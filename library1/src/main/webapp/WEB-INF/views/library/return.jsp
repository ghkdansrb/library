<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:import url="../module/header.jsp"/>
<c:import url="../module/left.jsp"/>

  <div class="w3-row w3-padding-64">
    <div class="w3-twothird w3-container">
      <h1 class="w3-text-teal">반납신청 </h1>

        	<div>
        		도서일련번호:<input type="text" >
        		<button type="button" class="btn btn-default">
     				<span class="glyphicon glyphicon-search"></span> Search
   				</button>
        	</div>


        	<br>
        	<h1>도서정보</h1>
        	<div>책이름</div>
        	<input type="text" class="form-control" name="bookName">
        	<div>출판사</div>
        	<input type="text" class="form-control" name="bookpblisher">
        	<h1>회원정보</h1>
        	<div>회원이름</div>
        	<input type="text" class="form-control" name="memberName">
        	<div>회원주소</div>
        	<input type="text" class="form-control" name="memberAddr">
        	<div>회원전화번호</div>
        	<input type="text" class="form-control" name="memberPhone">
			<h3>결제정보</h3>
        	<div>결제금액</div>
        	<input type="text" class="form-control" name="payment">
	<div class="container">

	</div>
    <div align="center">
    	<button>반납신청</button>
    </div>
    </div>
    <div class="w3-third w3-container">

    </div>
  </div>

  <div class="w3-row">
    <div class="w3-twothird w3-container">
      <h1 class="w3-text-teal"> </h1>
      <p>
      </p>
    </div>
    <div class="w3-third w3-container">
    </div>
  </div>

  <div class="w3-row w3-padding-64">
    <div class="w3-twothird w3-container">
      <h1 class="w3-text-teal"> </h1>
      <p>

      </p>
    </div>
  </div>





<!-- END MAIN -->
<c:import url="../module/hadan.jsp"/>