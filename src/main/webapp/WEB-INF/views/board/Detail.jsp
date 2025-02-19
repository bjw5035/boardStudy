<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>게시글 상세보기</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/styles.css">
    <script defer src="${pageContext.request.contextPath}/resources/js/detail.js"></script>
</head>
<body class="container py-5">

<!-- 상세 페이지 헤더 -->
<h2 class="mb-4">📄 게시글 상세보기</h2>

<div class="card">
    <div class="card-header bg-primary text-white">
        <h4>${post.title}</h4>
    </div>
    <div class="card-body">
        <%--        <p><strong>작성자 : </strong> ${post.userId}</p>--%>
        <%--        <p><strong>작성일 : </strong> ${post.createdAt}</p>--%>
        <hr>
        <p>${post.content}</p>
    </div>
</div>

<!-- 버튼 영역 -->
<div class="mt-4 d-flex justify-content-between">
    <a href="${pageContext.request.contextPath}/board/Board" class="btn btn-secondary">⬅ 목록으로</a>

    <%--    <c:if test="${sessionScope.userId eq post.userId}">--%>
    <%--        <div>--%>
    <%--            <a href="${pageContext.request.contextPath}/Board/edit?seq=${post.seq}" class="btn btn-warning">✏ 수정</a>--%>
    <%--            <a href="${pageContext.request.contextPath}/Board/btnDel?seq=${post.seq}" class="btn btn-danger"--%>
    <%--               onclick="return confirm('정말 삭제하시겠습니까?');">🗑 삭제</a>--%>
    <%--        </div>--%>
    <%--</c:if>--%>
</div>

</body>
</html>
