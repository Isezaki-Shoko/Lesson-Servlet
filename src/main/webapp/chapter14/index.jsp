<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>掲示板</title>

<style>

body{
    background:#fff7f7;
    font-family:"Yu Gothic";
    margin:0;
    padding:30px;
}

.container{
    width:700px;
    margin:auto;
}

h1{
    text-align:center;
    color:#8F7265;
    margin-bottom:30px;
}

.form-box{
    background:white;
    padding:25px;
    border-radius:20px;
    box-shadow:0 4px 10px rgba(0,0,0,0.08);
    margin-bottom:30px;
}

.label{
    color:#8F7265;
    font-weight:bold;
    margin-bottom:5px;
}

input[type="text"],
textarea{
    width:100%;
    padding:12px;
    border:2px solid #ffd6e0;
    border-radius:12px;
    margin-bottom:20px;
    box-sizing:border-box;
    font-size:15px;
}

textarea{
    height:120px;
    resize:none;
}

button{
    background:#ff9ebb;
    color:white;
    border:none;
    padding:12px 25px;
    border-radius:30px;
    font-size:16px;
    cursor:pointer;
    transition:0.2s;
}

button:hover{
    background:#ff7aa2;
    transform:scale(1.03);
}

.post{
    background:white;
    border-radius:20px;
    padding:20px;
    margin-bottom:20px;
    box-shadow:0 4px 10px rgba(0,0,0,0.08);
}

.name{
    color:#ff7aa2;
    font-weight:bold;
    font-size:18px;
}

.date{
    color:gray;
    font-size:12px;
    margin-top:5px;
}

.content{
    margin-top:15px;
    line-height:1.8;
    color:#444;
}

</style>
</head>

<body>

<div class="container">

<h1>掲示板📋</h1>

<div class="form-box">

<form action="/Servlet/insert" method="post">

<div class="label">名前</div>
<input type="text" name="name">

<div class="label">本文</div>
<textarea name="content"></textarea>

<button type="submit">🕊️投稿</button>

</form>

</div>

</body>
</html>