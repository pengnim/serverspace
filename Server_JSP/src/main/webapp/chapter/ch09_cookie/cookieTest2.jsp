<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String cookie = request.getHeader("Cookie"); // type넣기
	String name = "";
	String value = "";
	if (cookie != null) {
		Cookie[] c = request.getCookies();

		for (int i = 0; i < c.length; i++) {
			if (c[i].getName().equals("cookie1")) {
				name = c[i].getName();
				value = c[i].getValue();
			}
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>
		쿠키이름 ::
		<%=name%></h4>
	<h4>
		쿠키값 ::
		<%=value%></h4>
</body>
</html>