<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:import url="../module/header.jsp"/>
<c:import url="../module/left.jsp"/>

  <div class="w3-row w3-padding-64">
    <div class="w3-twothird w3-container">
      <h1 class="w3-text-teal">도서대여신청 </h1>

        	<div>
        		도서일련번호:<input type="text" >
        		<button type="button" class="btn btn-default">
     				<span class="glyphicon glyphicon-search"></span> Search
   				</button>
        	</div>

        	<div>
				회원일련번호:<input type="text" >
				<button type="button" class="btn btn-default">
     				<span class="glyphicon glyphicon-search"></span> Search
   				</button>
        	</div>

        	<br>
        	<h1>도서정보</h1>
        	<div>책이름</div>
        	<input type="text" class="form-control" name="bookName">
        	<div>출판사</div>
        	<input type="text" class="form-control" name="bookPulisher">
        	<h1>회원정보</h1>
        	<div>회원이름</div>
        	<input type="text" class="form-control" name="memberName">
        	<div>회원주소</div>
        	<input type="text" class="form-control" name="memberAddr">
        	<div>회원전화번호</div>
        	<input type="text" class="form-control" name="memberPhone">
			<h2>대여일자</h2>
			<p>대여시작일
			<input type="date" name="rentalStart">
			<p>대여종료일
			<input type="date" name="rentalEnd">

	<div class="container">
        <table class="table" border="1">

        	<tr>
        		<th>도서번호</th>
        		<th>책이름</th>
        		<th>대여시작일</th>
        		<th>대여종료일</th>
        	</tr>

        	<tr>
        		<td>1</td>
        		<td>난중일기</td>
        		<td>2017-01-21</td>
        		<td>2017-01-31</td>
        	</tr>

          	<tr>
        		<td>1</td>
        		<td>동의보감</td>
        		<td>2017-02-03</td>
        		<td>2017-03-01</td>
        	</tr>

        </table>
	</div>
    <div align="center">
    	<button>대여등록</button>
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