<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">--%>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/style.css">
<head>
    <title>Login</title>
</head>
<body>
<div class="container">
    <h2>Login</h2>
    <form action="" method="POST">
        <p>
            <label for="userId">아이디 : </label>
            <input type="text" id="userId" placeholder="아이디를 입력하세요." name="userId">
        </p>
        <p>
            <label for="userPw">패스워드 : </label>
            <input type="text" id="userPw" placeholder="패스워드를 입력하세요." name="userPw">
        </p>

        <div class="button-group">
            <%-- TODO 2025-02-07 로그인 실패 시 alert 띄우기 --%>
            <button class="ui-button" id="login" name="btnLogin" type="submit">로그인</button>
            <button class="ui-button signup-button" type="button">회원가입</button>
        </div>

    </form>
</div>

    <script src="${pageContext.request.contextPath}/resources/js/user.js"></script>
</body>
</html>
