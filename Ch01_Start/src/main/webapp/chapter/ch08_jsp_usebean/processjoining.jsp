<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- useBean id와 setProperty name이 일치해야함 -->
<jsp:useBean id="memberInfo" class="member.MemberInfo" scope="request"/>
<jsp:setProperty property="*" name="memberInfo"/>
<jsp:setProperty property="password" name="memberInfo" value="4567"/>
<jsp:setProperty property="id" name="memberInfo" value="idid"/>
<jsp:setProperty property="name" name="memberInfo" value="hong"/>
<jsp:setProperty property="email" name="memberInfo" value="hong@gmail.com"/>

name : <jsp:getProperty property="name" name="memberInfo"/><br>
email : <jsp:getProperty property="email" name="memberInfo"/>

</body>
</html>