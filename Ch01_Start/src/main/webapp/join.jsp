<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>
$(function() {
	$("#input").on("click",function(){

		$.ajax({
			url:'main.jsp',
			type:'post',
			error: function(){
				alert("입력에 실패 하였습니다");
				
			}
		});
	});
});
</script>
</head>
<body>
<jsp:useBean id="member" scope="request" class="Member"/>
<jsp:setProperty property="id" name="member" value="123456"/>
<jsp:setProperty property="pw" name="member" value="123456789"/>
<jsp:setProperty property="name" name="member" value="홍길동"/>
<jsp:setProperty property="date" name="member" value="211207"/>
<button id="input"> 입력 </button>
</body>
</html>