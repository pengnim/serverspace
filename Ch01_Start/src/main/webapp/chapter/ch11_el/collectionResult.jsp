<%@page import="java.util.Set"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
(1)Array <br>
${w[0]}<br>
${w[1]}<br>
${w[2]}<br>
<br>
${f[0]}<br>
${f[1]}<br>
${f[2]}
<br>
<br>
<%
 //getAttribute,반복문 사용
	String[] str = (String[])request.getAttribute("w");
    for(String s : str)
    	out.println(s+" ");
    out.println("<br>");
    
    String[] str2 = (String[])request.getAttribute("w");
    for(int i=0; i< str2.length; i++)
    	out.println(str2[i]+" ");
    out.println("<br>");
    
    out.println("<br>");
    ArrayList<String> str3 = (ArrayList<String>)request.getAttribute("f");
    for(String s : str3)
    	out.println(s+" ");
    out.println("<br>");
    
    
    
%>

//3.Map
//hong1=a1, hong2=a2, hong2=a3<br>
${p["hong1"]}<br>
${p["hong2"]}<br>
${p["hong3"]}
<br>
<br>
<%

HashMap<String,String> str4 = (HashMap<String,String>)request.getAttribute("p");
Set<String> ks = str4.keySet();
for(String s : ks){
	out.println(s + "=" + str4.get(s));
	
}
out.println("<br>");

%>
</body>
</html>