<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:import url="../module/header.jsp"/>
<c:import url="../module/left.jsp"/>

  <div class="w3-row w3-padding-64">
    <div class="w3-twothird w3-container">
      <h1 class="w3-text-teal">회원등록 </h1>
        <form action="/memberAdd" method="post">
        	<input type="hidden" name="libraryNo" value="${admin.sessionLibraryNo}">
        	<div>회원등급</div>
        	<div><input type="radio" value="일반" name="memberLevel" id="memberLevel">일반</div>
        	<div><input type="radio" value="회원" name="memberLevel" id="memberLevel">회원</div>
        	<div>회원이름</div>
        	<div><input type="text" class="form-control" name="memberName" id="memberName"></div>
        	<div>주소</div>
        	<div><input type="text" class="form-control" name="memberAddress" id="memberAddress"></div>
        	<div>전화번호</div>
        	<div><input type="text" class="form-control" name="memberPhone" id="memberPhone"></div>
			<div>
				<input type="submit" value="회원가입">
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
