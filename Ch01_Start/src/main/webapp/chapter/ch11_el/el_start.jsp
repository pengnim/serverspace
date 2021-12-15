<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${"(1) 리터럴"}<br>
\${"hello." } => ${"hello." }<br>
\${123 } => ${123 }<br>
\${null } => ${null }<br>

${"(2) 리터럴"}<br>
\${10+20} => ${10+20 }<br>
\${123==123} => ${123==123 }<br>
\${ture && false} => ${ture && false }<br>
\${2+5 ==7?7:10} => ${2+5 ==7?7:10 }<br>

</body>
</html>