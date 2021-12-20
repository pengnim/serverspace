<%@page import="java.util.Date"%>
<%@page import="java.util.HashMap"%>
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
	HashMap<String, Object> mapData = new HashMap<>();
	mapData.put("name", "홍길동");
	mapData.put("today", new Date());
	%>

	<c:set var="intArray" value="<%=new int[] { 1, 2, 3, 4, 5 }%>"></c:set>
	<c:set var="map" value="<%=mapData%>"></c:set>
	<h4>1~100::홀수의 합</h4>
	<c:set var="sum" value="0" />
	<c:forEach var="i" begin="1" end="100" step="2">
		<c:set var="sum" value="${sum+i}" />
	</c:forEach>
	결과 :: ${sum}
	<h4>구구단 : 4단</h4>
	<c:set var="four" value="4" />
	<c:forEach var="i" begin="1" end="9" step="1">
		${four } * ${i } = ${four*i}<br>
	</c:forEach>
	<h4>int형 배열 출력</h4>
	<c:forEach var="i" items="${ intArray}">
		${i}<br>
	</c:forEach>
	<h4>Map 출력</h4>
	<c:forEach var="i" items="${map}">
		${i}<br>
	</c:forEach>
</body>
</html>