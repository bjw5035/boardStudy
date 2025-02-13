<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container py-5">
    <div class="card shadow p-4 mx-auto" style="max-width: 400px;">
        <h2 class="text-centerd">Login</h2>
        <form action="" method="POST">
            <div class="mb-3">
                <label for="userId" class="form-label">아이디 : </label>
                <input type="text" class="form-control" id="userId" placeholder="아이디를 입력하세요."
                       name="userId">
            </div>
            <div class="mb-3">
                <label for="userPw" class="form-label">패스워드 : </label>
                <input type="text" class="form-control" id="userPw" placeholder="패스워드를 입력하세요."
                       name="userPw">
            </div>
            <button class="btn btn-primary w-100" id="login" name="btnLogin" type="submit">로그인
            </button>
            <div class="mt-3 text-center">
                <%-- TODO 2025-02-07 로그인 실패 시 alert 띄우기 --%>
                <button class="ui-button signup-button" type="button">회원가입</button>
            </div>
        </form>
    </div>
</div>

<script src="${pageContext.request.contextPath}/resources/js/user.js"></script>
</body>
</html>
