<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:import url="../module/header.jsp"/>
<c:import url="../module/left.jsp"/>

  <div class="w3-row w3-padding-64">
    <div class="w3-twothird w3-container">
      <h1 class="w3-text-teal">도서등록 </h1>
        <form action="/bookAdd" method="post">
        	<div>카테고리</div>
       		<div>
   	  			<select name="categoryNo">
   	  				<c:forEach items="${categoryList}" var="c">
       				<option value="${c.categoryNo}">${c.categoryName}</option>
	        		</c:forEach>
	        	</select>
       		</div>					
        	<div>도서이름</div>
        	<div><input type="text" class="form-control" name="bookName" id=bookName></div>
        	<div>저자</div>
        	<div><input type="text" class="form-control" name="bookWriter" id="bookWriter"></div>
        	<div>출판사</div>
        	<div><input type="text" class="form-control" name="bookPublisher" id="bookPublisher"></div>
        	<div>
        		<input type="submit" value="등록">
				<input type="reset" value="취소">
			</div>
        </form>
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