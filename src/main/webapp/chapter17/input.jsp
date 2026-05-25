<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<form action="input" method="post">

名前：<input type="text" name="name"
value="<%= session.getAttribute("name") %>">
<input type="submit" value="送信">
</form>

