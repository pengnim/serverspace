<%@ tag language="java" pageEncoding="UTF-8" body-content="tagdependent"%>
<%@ tag trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- tagdependent : 몸체 내부에 포함된 EL, Action Tag 처리하지 않고
몸체 내용 자체를 텍스트 값으로 사용 -->


<jsp:doBody var="bodyText"/>
<c:out value="${bodyText}" escapeXml ="true"></c:out>