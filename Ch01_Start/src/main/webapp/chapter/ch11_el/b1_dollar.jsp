<%@page import="ch11_el.Member"%>
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
	<!-- uri를 c라고 한다 변수를 구분하기 위한 용도 -->
	<%
	Member m = new Member();
	m.setName("이름1");
	%>
	<!-- jstl.jar가 있어야만 사용가능 -->
	<c:set var="m" value="<%=m%>"></c:set>
	<c:set var="name" value="${m.name}"></c:set>
	<%
	m.setName("이름2");
	%>
	${name }
	<br> \${m.name} : 표현이 실행되는 시점에 곧바로 계산(Immediate Expression)
</body>
</html>