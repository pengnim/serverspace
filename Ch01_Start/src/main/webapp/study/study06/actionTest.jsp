<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String id = request.getParameter("uid");
String pw = request.getParameter("upw");
String loginChk = request.getParameter("logincheck");

if (loginChk.equals("user")) {
%>
<!-- 액션태그 넣는 공간 -->
<!-- name 값은 임의적으로 jsp태그 안에 주석들어가면 오류뜸-->
<jsp:forward page="userMain.jsp">
	<jsp:param value='<%=URLEncoder.encode("전고객","UTF-8")%>' name="userName"/>
</jsp:forward>
<%
} else {
%>
<!-- 액션태그 넣는 공간 -->
<jsp:forward page="managerMain.jsp">
	<jsp:param value='<%=URLEncoder.encode("관리자","UTF-8")%>' name="userName"/>
</jsp:forward>
<%
}
%>