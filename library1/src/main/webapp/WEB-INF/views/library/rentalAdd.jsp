<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:import url="../module/header.jsp"/>
<c:import url="../module/left.jsp"/>
<script>
$(document).on('click', '#bookBtn', function(){
	$.ajax({
		url : "searchBook",
		type : "POST",
		data : {bookNo : $("#getbookNo").val()},
		dataType : "json",
		success : function(data) {
				$("#bookNo").val(data.book.bookNo);	
				$("#bookName").val(data.book.bookName);
				$("#bookPublisher").val(data.book.bookPublisher);
			}
		});
});
$(document).on('click', '#memberBtn', function(){
	$.ajax({
		url : "searchMember",
		type : "POST",
		data : {memberNo : $("#getmemberNo").val()},
		dataType : "json",
		success : function(data) {
				$("#memberNo").val(data.member.memberNo);	
				$("#memberName").val(data.member.memberName);
				$("#memberAddr").val(data.member.memberAddress);
				$("#memberPhone").val(data.member.memberPhone);
			}
		});
});
</script>
	<div class="w3-row w3-padding-64">
		<div class="w3-twothird w3-container">
		<h1 class="w3-text-teal">도서대여신청 </h1>
			
				<div>
	        		도서일련번호:<input type="text" id="getbookNo">
	        		<button type="button" id="bookBtn"class="btn btn-default">
	     				<span class="glyphicon glyphicon-search"></span> Search
	   				</button>
	        	</div>
	
	        	<div>
					회원일련번호:<input type="text" id="getmemberNo">
					<button type="button" id="memberBtn" class="btn btn-default">
	     				<span class="glyphicon glyphicon-search"></span> Search
	   				</button>
	        	</div>
			<form action="/rentalAdd" method="post">
				<input type="hidden" id="bookNo" name="bookNo">
				<input type="hidden" id="memberNo" name="memberNo">
			  	<br>
	        	<h1>도서정보</h1>
	        	<div>책이름</div>
	        	<div><input type="text" id="bookName" class="form-control" name="bookName"></div>
	        	<div>출판사</div>
	        	<div><input type="text" id="bookPublisher" class="form-control" name="bookPulisher"></div>
	        	
	        	<h1>회원정보</h1>
	        	<div>회원이름</div>
	        	<div><input type="text" id="memberName" class="form-control" name="memberName"></div>
	        	<div>회원주소</div>
	        	<div><input type="text" id="memberAddr" class="form-control" name="memberAddr"></div>
	        	<div>회원전화번호</div>
	        	<div><input type="text" id="memberPhone" class="form-control" name="memberPhone"></div>
	        	
	        	<h1>선결제</h1>
				<div><input type="text" id="prepayment" class="form-control" name="prepayment"></div>
			    <div align="center">
			    	<input type="submit" value="대여신청">
			    </div>
			</form>
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