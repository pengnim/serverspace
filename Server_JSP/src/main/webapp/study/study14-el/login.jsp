<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="myBean" class="ch11_el.LoginBean" scope="request"></jsp:useBean>
<jsp:setProperty property="*" name="myBean"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
아이디 : ${myBean.userId}<br>
비밀번호 : ${myBean.passwd}<br>
아이디 : <jsp:getProperty property="userId" name="myBean"/><br>
비밀번호 : <jsp:getProperty property="passwd" name="myBean"/><br>
<br>
입력 파라미터를 저장하지 않고 바로 출력<br>
아이디 : ${param.userId}<br>
비밀번호 : ${param.passwd}<br>
</body>
</html>