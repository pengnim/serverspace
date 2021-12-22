<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>
$("#button").on("click", function(){
	var pwchk = $("#pwchk").val();
	var pw = $("#pw").val();
	
	if(pwchk == pw){
		$.ajax({
			
			url:"join.jsp",
			type:"post"
			
		});
	}
	else{
		alert("비밀번호를 다시입력해주세요");
	}
});



</script>

</head>
<body>


	id :
	<input type="text" name="id" id="id" required="required" autofocus>
	<br> password :
	<input type="password" name="pw" id="pw" required="required">
	<br> password check :
	<input type="password" name="pwchk" id="pwchk" required="required">
	<br>
	<button id="button">submit</button>


</body>
</html>