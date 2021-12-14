<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	Cookie c = new Cookie("name", "1234");
	response.addCookie(c);
	%>

	쿠키이름::<%=c.getName()%>
	쿠키 값::<%=c.getValue()%>
</body>
</html>