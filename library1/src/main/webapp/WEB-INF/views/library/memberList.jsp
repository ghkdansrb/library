<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="../module/header.jsp"/>
<c:import url="../module/left.jsp"/>

 <div class="w3-row w3-padding-64">
    <div class="w3-twothird w3-container">
      <h1 class="w3-text-teal">ȸ�����</h1>

    <div>��üȸ���� �� : ${totalRowCount}/${list.size()}</div>
    <div class="container">
    <table class="table" border="1">
        <thead>
            <tr>
                <th>no</th>
                <th>ȸ���̸�</th>
                <th>ȸ�����</th>
                <th>ȸ���ּ�</th>
                <th>ȸ����ȣ</th>
                <th>���Գ�¥</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="b" items="${list}">
                <tr>
                    <td>${b.memberNo}</td>
                    <td>${b.memberName}</td>
                    <td>${b.memberLevel}</td>
                    <td>${b.memberAddress}</td>
                    <td>${b.memberPhone}</td>
                    <td>${b.memberDate}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
 
    <div>
        <a href="<%=request.getContextPath()%>memberAdd">ȸ�����</a>
    </div>
    <div>
        <c:if test="${currentPage>1}">
            <a href="<c:url value='/memberList?currentPage=${currentPage-1}'/>">����</a>
        </c:if>
        <c:if test="${currentPage < lastPage}"> 
            <a href="<c:url value='/memberList?currentPage=${currentPage+1}'/>">����</a>
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