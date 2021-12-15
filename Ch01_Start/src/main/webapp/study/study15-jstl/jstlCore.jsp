<%@page import="java.util.ArrayList"%>
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
	<%
	int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	ArrayList<String> names = new ArrayList<String>();
	names.add("홍길동");
	names.add("유관순");
	names.add("이순신");
	%>


	<c:set var="arr" value="<%=nums%>"></c:set>
	<c:set var="names" value="<%=names%>"></c:set>
	<c:set var="str" value="A B C D"></c:set>

	<h2>JSTL Core 라이브러리 실습(배열저장 1~10)</h2>
	<c:forEach var="i" items="${arr}" begin="0" end="10" step="1">
	${i}&it;
</c:forEach>
	<br>
	<c:forEach var="i" items="${arr}" begin="0" end="7" step="1">
	${i}&it;
</c:forEach>
	<br>
	<h2>JSTL Core 라이브러리 실습2(ArrayList:홍길동 유관순 이순신)</h2>
	<c:forEach var="i" items="${names}" begin="0" end="3" step="1">
	${i}&it;
</c:forEach>
	<br>
	<h2>JSTL Core 라이브러리 실습3(String A,B,C,D)</h2>
	<c:forTokens var="i" items="${str}" delims=" ">
	${i}<br>
	</c:forTokens>



</body>
</html>