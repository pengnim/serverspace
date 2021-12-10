<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP:forward(179)</title>
</head>
<body>
<img src="jsp_forward.jpg"><br>
이 페이지는  from.jsp페이지 입니다1.<br>
<%
	//리퀘스트 영역에 정보 저장
	//세션 저장 : session.setAttribute --> 브라우저가 열린 상태에서만 정보 존재
	//모든 것 다 저장하려면 : application영역에 저장
	//pageContext 영역
	request.setAttribute("number", "1234");
%>
<jsp:forward page="to.jsp?name=hong">
	<jsp:param value="abcd" name="id"/>
</jsp:forward>

이 페이지는  from.jsp페이지 입니다2.<br>
</body>
</html>