<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="../module/header.jsp"/>
<c:import url="../module/left.jsp"/>

 <div class="w3-row w3-padding-64">
    <div class="w3-twothird w3-container">
      <h1 class="w3-text-teal">�������</h1>

    <div>��ü������ �� : ${totalRowCount}/${list.size()}</div>
    <div class="container">
    <table class="table" border="1">
        <thead>
            <tr>
                <th>no</th>
                <th>�����̸�</th>
                <th>���ǻ�</th>
                <th>�뿩����</th>
                <th>�����</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="b" items="${list}">
                <tr>
                    <td>${b.bookNo}</td>
                    <td><a href="<%=request.getContextPath()%>/bookView?bookNo=${b.bookNo}">${b.bookName}</a></td>
                    <td>${b.bookPublisher}</td>
                    <td>${b.bookRentalstate}</td>
                    <td>${b.bookDate}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
 
    <div>
        <a href="<%=request.getContextPath()%>bookAdd">�������</a>
    </div>
    <div>
        <c:if test="${currentPage>1}">
            <a href="<c:url value='/bookList?currentPage=${currentPage-1}'/>">����</a>
        </c:if>
        <c:if test="${currentPage < lastPage}"> 
            <a href="<c:url value='/bookList?currentPage=${currentPage+1}'/>">����</a>
        </c:if>
 
    </div>
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