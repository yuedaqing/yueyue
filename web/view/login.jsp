<%--
  Created by IntelliJ IDEA.
  User: YueYue
  Date: 2021/12/31
  Time: 0:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆页面</title>
    <style>
        td{
            text-align-all: center;
        }
        table{
            background-image: url("../imgs/zls02.jpg");
            background-size:30%;
        }
    </style>
</head>
<body>
<form action="/user/login.do" method="post">
<table border="10" width="500" align="center">
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
        <td>
            <input type="submit" value="确认登录">
        </td>
        <td>
            <a href="reg.jsp">注册用户</a>
        </td>
    </tr>
    <script type="text/javascript">
        var eye = document.getElementById("eye");
        var pwd = document.getElementById("pwd");
        function showhide(){
            if(pwd.type=="password"){
                pwd.type = "text";
                eye.className='fa fa-eye-slash'
            }else{
                pwd.type="password";
                eye.type = 'fa fa-eye'
            }
        }
    </script>
</table>
</form>
</body>
</html>
