<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="pinfo" class="study08.PersonalInfo" scope="request"></jsp:useBean>
request 영역으로부터 자바빈 객체를 가져오기<br>
이름:<jsp:getProperty property="name" name="pinfo"/><br>
나이:<jsp:getProperty property="age" name="pinfo"/><br>
성별:<jsp:getProperty property="gender" name="pinfo"/><br>
</body>
</html>