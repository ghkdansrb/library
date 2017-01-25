<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:import url="../module/header.jsp"/>
<c:import url="../module/left.jsp"/>

  <div class="w3-row w3-padding-64">
    <div class="w3-twothird w3-container">
      <h1 class="w3-text-teal">회원등록 </h1>
        <form>
        	<div>회원등급</div>
        	<input type="radio" value="일반" name="memberLevel" id="memberLevel">일반
        	<input type="radio" value="회원" name="memberLevel" id="memberLevel">회원
        	<div>회원이름</div>
        	<input type="text" class="form-control" name="memberName" id="memberName">
        	<div>주소</div>
        	<input type="text" class="form-control" name="memberAddr" id="memberAddr">
        	<div>전화번호</div>
        	<input type="text" class="form-control" name="memberPhone" id="memberPhone">

			<input type="submit" value="회원가입">
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
