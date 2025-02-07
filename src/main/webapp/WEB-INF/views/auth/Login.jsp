<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h2>Login</h2>
<form action="" method="POST">
    <div>
        <p>
            <label for="userId">아이디 : </label>
            <input type="text" id="userId" name="userId">
        </p>
        <p>
            <label for="userPw">패스워드 : </label>
            <input type="text" id="userPw" name="userPw">
        </p>
    </div>
    <%-- TODO 2025-02-07 로그인 실패 시 alert 띄우기 --%>
    <button class="ui-button" id="login" name="btnLogin" type="submit">로그인</button>
</form>
    <button type="button" onclick="location.href='Signup'">회원가입</button>
    <button class="ui-button" id="logOut" name="btnLogOut">로그아웃</button>

<%--    <script type="text/javascript" src="<c:url value="/WEB-INF/js/user.js"/>"></script>--%>
</body>
</html>
