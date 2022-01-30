<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: YueYue
  Date: 2021/12/31
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生信息表</title>
    <style>
        td{
            text-align-all: center;
        }
    </style>
</head>
<body>
<h5 align="right"><a href="/user/zx.do">注销</a></h5>
<table width="600" align="center" border="10">
    <tr>
        <td>
            <a href="/student/add.jsp">添加学生</a>
        </td>
    </tr>
    <tr>
        <td>学生编号</td>
        <td>学生姓名</td>
        <td>学生性别</td>
        <td>学生日期</td>
    </tr>
    <c:forEach var="s" items="${student}">
    <tr>
        <td>${s.stuno}</td>
        <td>${s.stuname}</td>
        <td>${s.sex}</td>
        <td>${s.birthday}</td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
