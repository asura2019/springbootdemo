<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>用户登录</title>
    <style>
        body{
            background: url("../images/1.jpeg") no-repeat left top;
            background-size: 100%;
        }
    </style>
</head>
<body>
请输入用户名与密码登录
<form action="/userLogin" method="post">
    用户名：<input type="text" name="username" /><br>
    密&nbsp;&nbsp;&nbsp;码：<input type="password" name="password1" /><br>
    <input type="submit" value="登录" />
    <a href="/user/registerpage" target="_blank">注册</a>
</form>
</body>
</html>