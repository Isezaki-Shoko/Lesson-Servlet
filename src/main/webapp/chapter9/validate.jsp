<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
String username = request.getParameter("username");

if (username == null || username.isEmpty()) {
	request.getRequestDispatcher("error.jsp")
	.forward(request, response);

} else if (username.equals("admin")) {
	response.sendRedirect("admin.jsp");

} else {
	request.getRequestDispatcher("home.jsp")
	.forward(request, response);
}
%>