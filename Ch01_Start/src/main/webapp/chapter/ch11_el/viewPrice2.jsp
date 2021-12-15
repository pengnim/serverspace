<%@page import="ch11_el.FormatUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
request.setAttribute("price", 12345L);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL함수 호출</title>
</head>
<body>
<% %>
	//주의!!! jsp-config는 한개만 있어야함<br>
	EL에서 static method()를 사용하기 위한 방법 - "class.method()" =>자바랑 똑같음
	<br> 가격은
	<b>${FormatUtil.number(price,'#,##0')}</b>
</body>
</html>