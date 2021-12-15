<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    
    	Cookie c = new Cookie("cookie","admin");
    	c.setMaxAge(600*60);
    	response.addCookie(c);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>El::Cookie</title>
</head>
<body>
Cookie 값 :: ${cookie.cookie.value}<br>
Cookie 값 :: ${cookie["cookie"]["value"]}<br>
Cookie 유지시간 :: ${cookie.cookie.maxAge}<br>
</body>
</html>