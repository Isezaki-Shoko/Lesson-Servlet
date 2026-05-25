<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="beans.Favorite"%>

<%
ArrayList<Favorite> list = (ArrayList<Favorite>) session.getAttribute("list");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>お気に入り登録</title>
</head>

<body>

	<h1>お気に入り登録</h1>

	<!-- 追加フォーム（FavoriteServletへ） -->
	<form action="FavoriteServlet" method="post">

		名前： <input type="text" name="name"> URL： <input type="text"
			name="url"> <input type="submit" value="追加">

	</form>

	<hr>

	<h3>登録一覧</h3>

	<ul>
		<%
		if (list != null) {
			for (Favorite f : list) {
		%>
		<li><a href="<%=f.getUrl()%>"> <%=f.getName()%>
		</a></li>
		<%
		}
		} else {
		%>
		<li>まだ登録はありません</li>
		<%
		}
		%>
	</ul>

	
	<form action="ClearServlet" method="get">
		<input type="submit" value="クリア">
	</form>

</body>
</html>