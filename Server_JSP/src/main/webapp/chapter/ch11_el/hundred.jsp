<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- 1~100까지 합 => forword => hunderedResult.jsp=> EL확인-->
<%
int sum = 0;
for (int i = 1; i <= 100; i++) {
	sum += i;
}
request.setAttribute("sum", sum);
%>

<jsp:forward page="hundredResult.jsp"></jsp:forward>