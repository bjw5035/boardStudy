<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

    <h2>Login</h2>
<form action="Login" method="POST">
    <div>
        <p>
            <label for="userId">아이디 : </label>
            <input type="text" id="userId" name="username">
        </p>
        <p>
            <label for="userPw">패스워드 : </label>
            <input type="text" id="userPw" name="password">
        </p>
        <button class="ui-button" id="login" name="btnLogin" onclick="login()">로그인</button>
        <button class="ui-button" id="logOut" name="btnLogOut">로그아웃</button>
    </div>
</form>

    <script type="text/javascript" src="/WEB-INF/js/user.js"></script>
</body>
</html>
