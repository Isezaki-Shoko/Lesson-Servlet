<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8"
	errorPage="square-error.jsp"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
request.setCharacterEncoding("UTF-8");
int number = Integer.parseInt(request.getParameter("number"));
int result = number * number;
%>

	<p>
		入力した数値：<%=number%></p>

	<p>
		結果：<%=result%></p>

</body>
</html>