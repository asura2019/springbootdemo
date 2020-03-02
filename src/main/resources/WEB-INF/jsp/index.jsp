<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登录成功</title>
    <style>
        body{
           background: url("../images/2.jpeg") no-repeat left top;
            background-size: 100%;
        }
    </style>
</head>
<body style="margin: auto">
<div>
    <h1>用户名与密码正确，登录成功！！！</h1>
    <table border="1">
         <tr>
            <td  width="100">序号</td>
            <td  width="100">用户名</td>
            <td  width="100">新闻标题</td>
            <td  width="100">新闻1</td>
            <td  width="100">新闻2</td>
        </tr>
    <c:forEach  items="${list}" var="p" varStatus="st">
        <tr>
           <td>${st.index+1} </td>
           <td>${p.USERNAME} </td>
           <td> ${ p.news_title}</td>
           <td>${ p.news_map}</td>
           <td> ${ p.news_content}</td>
      </tr>
    </c:forEach>
    </table>
</div>


</body>
</html>