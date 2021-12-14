<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="true" %>
<%
	Date time = new Date();
	SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--  <img src="session.png"><br>-->
세션ID : <%=session.getId() %><br>
<%
	//getCreationTime : 세션이 만들어진 시간
	time.setTime(session.getCreationTime());
	out.println("세션 생성시간: "+f.format(time)+"<br>");
	
	time.setTime(session.getLastAccessedTime());
	out.println("최근 접근시간: "+f.format(time));

	session.setAttribute("memberid", "abcd");
	session.setAttribute("name", "hong");
	
	String name = (String)session.getAttribute("name");
	out.println("<br>회원명 : "+ name +"<br>세션을 종료합니다.");
	
	//세션 종료 : 아래 두 함수 또는 브라우저 닫기
	session.setMaxInactiveInterval(60*60); //한시간에 해당함 60초(1분) * 60
	session.invalidate();

%>

</body>
</html>