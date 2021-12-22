<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tf" tagdir="/WEB-INF/tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- map 형식으로 저장함 dynamic-attributes-->
<tf:select name="code" rgb="RGB모드" wb="흑백모드"/>
<tf:select name="genre" rock="락" ballad="발라드" metal="메탈"/>

</body>
</html>