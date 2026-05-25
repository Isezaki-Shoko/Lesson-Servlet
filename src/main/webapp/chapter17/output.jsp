<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%
String name = (String)request.getAttribute("name");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>こんにちは、<%= name %>さん！</h1>
<a href="input.jsp">戻る</a>
</body>
</html>