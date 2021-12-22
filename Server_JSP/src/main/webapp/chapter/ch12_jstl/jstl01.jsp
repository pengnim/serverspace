<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- <img src="jstl01.png">
<img src="coretag table.png">

 -->
	<h3>JSTL:: Core(295)</h3>
	JSTL :: JSP Standard Tag Library : 커스텀 태그중에서 많이 사용되는 것을 모아서 표준으로 삼은것
	<br> 가독성을 높이기 위해 사용
	<br>
	<br>
	<hr>
	<%
	int n1 = 10;
	int n2 = 20;
	%>
	<c:set var="num1" value="7"></c:set>
	<c:set var="num2" value="9"></c:set>
	<c:set var="result" value="${num1*num2}"></c:set>
	<c:set var="result2" value="<%=n1 + n2%>"></c:set><!-- value에 c:set var값을 jsp형태로 넣을순 없음 -->
	${num1 }와 ${num2 }의 곱은 ${result }<br>
	<%=n1 %>와 <%=n2 %>의 합은 ${result2 }<br>
</body>
</html>