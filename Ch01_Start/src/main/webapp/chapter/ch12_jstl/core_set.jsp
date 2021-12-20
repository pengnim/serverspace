<%@page import="java.util.HashMap"%>
<%@page import="ch12_jstl.Member"%>
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
	Member m = new Member();
	HashMap<String, String> hm = new HashMap<>();
	hm.put("color", "green");
	%>
	<c:set var="member" value="<%=m %>"></c:set>
	<c:set target="${member}" property="name" value="홍길동"></c:set>
	<c:set var="pref" value="<%=hm %>"/>
	<c:set var="favoriateColor" value="${pref.color}"/>
	
회원이름 :: ${member.name}<br>
좋아하는 색1 :: ${favoriateColor }<br>
<c:set target="${pref}" property="color2" value="red"></c:set>
설정 이후 좋아하는 색2 :: ${pref.color2 }<br>

	
</body>
</html>