<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL</title>
</head>
<body>
	<%
	//xml에서 설정
	String param1 = getServletContext().getInitParameter("Name");
	String param2 = getServletContext().getInitParameter("age");
	out.println("Name:" + param1 +"<br>" +"age : "+ param2+"<br>");
	
	
	%>
	
	초기화 Parameter Name:: ${initParam.Name}<br>
	초기화 Parameter age :: ${initParam.age }<br>
	<hr>
	요청 URI: ${pageContext.request.requestURI }<br>
	요청 URI: <%=request.getRequestURI() %><br>
	<hr>
	아이디: ${param.id}
	<br> 선택한 운동: ${paramValues.sports[0]} ${paramValues.sports[1]}
	${paramValues.sports[2]} ${paramValues.sports[3]}
</body>
</html>