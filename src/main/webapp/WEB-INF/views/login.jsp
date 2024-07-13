<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<script>

</script>

<body>

    <h2>Login</h2>
<form action="login" method="post">
    <div>
        <form method="POST">
            <p>
                <label for="username">아이디 : </label>
                <input type="text" id="username" name="username">
            </p>

            <p>
                <label for="password">패스워드 : </label>
                <input type="text" id="password" name="password">
            </p>
            <button class="ui-button" id="login" name="btnLogin">로그인</button>
            <button class="ui-button" id="logOut" name="btnLogOut">로그아웃</button>
        </form>
    </div>
</form>

</body>
</html>
