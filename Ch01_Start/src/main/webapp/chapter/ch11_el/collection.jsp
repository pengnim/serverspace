<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
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

<%
//(1)Array
String winner[] = new String[3];
winner[0] = "홍길동1";
winner[1] = "홍길동2";
winner[2] = "홍길동3";

ArrayList<String> fruits = new ArrayList<String>();
fruits.add("딸기");
fruits.add("오렌지");
fruits.add("복숭아");

HashMap<String,String> person = new HashMap<String, String>();
person.put("hong1", "a1");
person.put("hong2", "a2");
person.put("hong3", "a3");

request.setAttribute("w", winner);
request.setAttribute("f", fruits);
request.setAttribute("p", person);
RequestDispatcher d = request.getRequestDispatcher("collectionResult.jsp");
d.forward(request,response);

//(2)ArrayList
//딸기, 오렌지, 복숭아


%>



</body>
</html>