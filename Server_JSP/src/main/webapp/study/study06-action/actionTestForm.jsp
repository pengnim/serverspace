<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="actionTest.jsp">
		아이디:<input type="text" name="uid"><br> 암 &nbsp;호:<input
			type="password" name="upw"><br> <input type="radio"
			name="logincheck" value="user" checked="checked">사용자 <input
			type="radio" name="logincheck" value="maneger">관리자
			<input type="submit" value="로그인"> 
			
	</form>
</body>
</html>