<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>회원가입</title>
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/styles.css">
</head>
<body class="container py-5">
<div class="card shadow p-4 mx-auto" style="width: 500px;">
    <h2 class="text-center">회원가입</h2>
    <form action="Signup.jsp" method="POST">
        <div class="mb-3">
            <label for="joinId" class="form-label">아이디 : </label>
            <input type="text" class="form-control" id="joinId" name="joinId">
        </div>
        <div class="mb-3">
            <label for="joinPw" class="form-label">패스워드 : </label>
            <input type="text" class="form-control" id="joinPw" name="joinPw">
        </div>
        <div class="mb-3">
            <label for="joinName" class="form-label">이름 : </label>
            <input type="text" class="form-control" id="joinName" name="joinName">
        </div>
        <button class="btn btn-success w-100" type="submit">가입하기</button>
        <button class="btn btn-secondary login_move" type="button">로그인 이동</button>
    </form>
</div>

<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/user.js"></script>

</body>
</html>
