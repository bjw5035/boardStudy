<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CONTENT</title>
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/styles.css">
</head>
<body class="container py-5">

<h2 class="text-center mb-4">📝 글 작성</h2>

<div class="write-container">
    <form action="" method="POST">
        <div class="mb-3">
            <label for="title" class="form-label">제목</label>
            <input type="text" class="form-control" id="title" name="title" placeholder="제목을 입력하세요">
        </div>
        <div class="mb-3">
            <label for="content" class="form-label">내용</label>
            <textarea class="form-control" id="content" name="content" rows="6" placeholder="내용을 입력하세요"></textarea>
        </div>
        <div class="mb-3">
            <label class="form-label">작성자 : </label>
            <label>
                <input type="text" class="form-control" name="userId" value="${userId}" readonly>
            </label>
        </div>
        <div class="button-group">
            <input type="submit" class="btn btn-primary" value="게시글 작성" onclick="alert('작성 완료!')">
            <button class="btn btn-secondary" id="btnMove" name="btnMove" type="button">목록</button>
        </div>
    </form>
</div>

<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/write.js"></script>

</body>
</html>
