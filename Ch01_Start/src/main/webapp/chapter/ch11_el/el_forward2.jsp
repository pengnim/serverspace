<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

Attribute name :: ${name}<br>
scope name:: ${requestScope.name }<br>
Member.name :: ${m.name}<br>
Member.id:: ${m.id}<br>

요청URI :: ${pageContext.request.requestURI}<br>
요청URI :: <%=request.getRequestURI() %><br>
parameter code:: ${param.code}
</body>
</html>