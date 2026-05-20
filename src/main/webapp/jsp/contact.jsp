<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>お問い合わせフォーム</title>
</head>
<body>
	<p>お問い合わせフォーム</p>
	<form action="contact.jsp" method="post"></form>
	氏名【必須】<input type="text" name="name"><br>
	 会社名<input type="text" name="work"><br> 
	 メールアドレス【必須】<input type="text" name="mail"><br>
	  お問合せ内容【必須】<p><textarea type="textarea" name="toiawase"></textarea></p>
	<p>メルマガの種類</p>
	総合案内<input type="checkbox" value="merumaga"><br>
	セミナー案内<input type="checkbox" value="merumaga"><br>
	求人採用情報<input type="checkbox" value="merumaga"><br>
	<p>資料請求希望</p>
	Yes<input type="radio" value=yesno> 
	No<input type="radio" value=yasno><br>
	<input type=submit value="送信">
</body>
</html>