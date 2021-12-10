<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Directive include</title>
</head>
<body>
<!-- <img src="directive_include.jpg"><br> -->



<% int number = 10; %>
<!-- %@ 사용하면 directive -->
<!-- 
공용변수 사용시 include file 
includer.jsp 의 number변수 : includee.jspf에서 사용
includee.jspf 의 dataFoloder변수 : includer.jsp에서 사용
-->
<%@ include file="includee.jspf" %>
공통변수 DATAFOLDER = "<%=dataFolder %>"
</body>
</html>