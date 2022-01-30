<%--
  Created by IntelliJ IDEA.
  User: YueYue
  Date: 2022/1/3
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        td{
            text-align-all: center;
        }
    </style>
</head>
<body>
<form action="/student/add.do" method="post">
    <table width="600" border="10" align="center">
        <tr>
            <td>玩家姓名</td>
            <td>
                <input placeholder="请输入选手姓名" name="stuname">
            </td>
        </tr>
        <tr>
            <td>玩家性别</td>
            <td>
                <input placeholder="请输入选手性别" name="sex">
            </td>
        </tr>        <tr>
        <td>建立日期</td>
        <td>
            <input type="date" name="birthday">
        </td>
         </tr>
        <tr>
            <td>所在账号</td>
            <td>
                <input type="number" max="10" min="1"  name="userno">
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="确认添加">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
