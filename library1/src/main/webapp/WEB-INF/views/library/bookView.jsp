<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="../module/header.jsp"/>
<c:import url="../module/left.jsp"/>

	<div class="w3-row w3-padding-64">
		<div class="w3-twothird w3-container">
     		 <h1 class="w3-text-teal">����������</h1>
		<form action="/bookModify" method="post">
		    <div>no</div>
		    <div><input type="text" class="form-control" name="bookNo" value='${book.bookNo}' readonly="readonly"></div>
		    <div>�����̸�</div>
		    <div><input type="text" class="form-control" name="bookName" value='${book.bookName}'></div>
		    <div>ī�װ�</div>
		    <div><input type="text" class="form-control" name="categoryName" value='${book.categoryName}'></div>
		    <div>����</div>
		    <div><input type="text" class="form-control" name="bookWriter" value='${book.bookWriter}'></div>
		    <div>���ǻ�</div>
		    <div><input type="text" class="form-control" name="bookPublisher" value='${book.bookPublisher}'></div>
		    <div>���ʴ뿩��</div>
		    <div><input type="text" class="form-control" name="bookStartday" value='${book.bookStartday}' readonly="readonly"></div>
		    <div>�Ѵ뿩Ƚ��</div>
		    <div><input type="text" class="form-control" name="bookTotalrental" value='${book.bookTotalrental}' readonly="readonly"></div>
		    <div>�뿩����</div>
		    <div><input type="text" class="form-control" name="bookRentalstate" value='${book.bookRentalstate}' readonly="readonly"></div>
		    <div>�����</div>
		    <div><input type="text" class="form-control" name="bookDate" value='${book.bookDate}' readonly="readonly"></div>
		
		   <div>
				<input type="submit" value="����">
    		</div>
		</form>
			<a href="<c:url value='/bookRemove?bookNo=${book.bookNo}'/>"><button>����</button></a>
			<a href="<c:url value='/bookDiscard?bookNo=${book.bookNo}'/>"><button>�����</button></a>

 
    
    <div>
    
    </div>
    
	</div>
</div>
    
    <div class="w3-third w3-container">

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