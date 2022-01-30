<%--
  Created by IntelliJ IDEA.
  User: YueYue
  Date: 2021/12/31
  Time: 0:21
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
        table{
            background-image: url("../imgs/zls01.jpg");
            background-size:30%;
        }
        body{
            background-image: url("../imgs/zls08.jpg");
            background-size:40%;
        }
    </style>
</head>
<body>
<form action="/user/reg.do" method="post" >
    <table border="10" width="500" align="center">
        <tr>
            <td>账号昵称</td>
            <td>
                <input placeholder="请输入昵称" name="username">
            </td>
        </tr>
        <tr>
            <td>账号：</td>
            <td>
                <input placeholder="请输入账号" name="userid">
            </td>
        </tr>
        <tr>
            <td>密码：</td>
            <td>
                <input type="password" placeholder="请输入密码" name="userpassword">
            </td>
        </tr>
        <tr>
            <td>性别：</td>
            <td>
                男：<input type="radio" value="男" name="sex" checked>
                女：<input type="radio" value="女" name="sex">
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="确认注册">
            </td>
            <td>
                <a href="login.jsp">登录界面</a>
            </td>
        </tr>
        <script type="text/javascript">
            var eye = document.getElementById("eye");
            var pwd = document.getElementById("pwd");
            function showhide(){
                if(pwd.type=="password"){
                    pwd.type = "text";
                    eye.className='fa fa-eye-slsh'
                }else{
                    pwd.type="password";
                    eye.type = "fa fa-eye"
                }
            }
        </script>
    </table>
</form>
</body>
</html>
