<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="elfunc" uri="/WEB-INF/tlds/fn2.tld" %>
<%
request.setAttribute("price", 123456);

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL함수 호출</title>
</head>
<body>
//주의!!! jsp-config는 한개만 있어야함<br>
오늘은 <b>${elfunc:formatNumber(price, '#,##0')}</b>
</body>
</html>