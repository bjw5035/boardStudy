<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/styles.css">
</head>
<body>
<div class="container py-5">
    <div class="card shadow p-4 mx-auto" style="max-width: 400px;">
        <h2 class="text-center">Login</h2>
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
            <div class="btn-group">
                <button type="submit" id="login" name="btnLogin" class="btn btn-primary w-100">로그인
                </button>
                <%-- TODO 2025-02-07 로그인 실패 시 alert 띄우기 --%>
                <button type="button" class="btn btn-secondary signup-button">회원가입</button>
                <button type="button" class="btn btn-info idPwMoveButton">아이디/비밀번호 찾기</button>
            </div>
        </form>
    </div>
</div>

<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/user.js"></script>
</body>
</html>
