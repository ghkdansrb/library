<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="../module/header.jsp"/>
<c:import url="../module/left.jsp"/>

 <div class="w3-row w3-padding-64">
    <div class="w3-twothird w3-container">
      <h1 class="w3-text-teal">�뿩���</h1>

    
    <div class="container">
    <table class="table" border="1">
        <thead>
            <tr>
                <th>no</th>
                <th>ȸ����ȣ</th>
                <th>������ȣ</th>
                <th>�뿩��</th>
                <th>�ݳ���</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="b" items="${list}">
                <tr>
                    <td>${b.rentalNo}</td>
                    <%-- <td><a href="<%=request.getContextPath()%>/bookView?bookNo=${b.bookNo}">${b.bookName}</a></td> --%>
                    <td>${b.memberNo}</td>
                    <td>${b.bookNo}</td>
                    <td>${b.rentalStartday}</td>
                    <td>${b.rentalEndday}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
 

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