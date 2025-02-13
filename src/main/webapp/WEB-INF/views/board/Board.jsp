<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>게시판</title>
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/styles.css">
</head>
<body class="container py-5">

<h1 class="text-center mb-4">게시판</h1>

<!-- 제목 & 글쓰기 버튼을 같은 줄에 배치 -->
<div class="d-flex justify-content-between align-items-center mb-3">
    <button class="btn btn-outline-dark write-button" id="write" name="btnWrite" type="button">📝
        글쓰기
    </button>
    <!-- 추가된 기능: 마이페이지 및 로그아웃 버튼 -->
    <a href="MyPage.jsp" class="btn btn-outline-secondary me-2">👤 마이페이지</a>
    <a href="/auth/Logout.jsp" class="btn btn-outline-danger">🚪 로그아웃</a>
</div>

<!-- 검색 기능 추가 -->
<div class="mb-3">
    <%--    <label for="searchBox"></label><input type="text" id="searchBox" class="form-control"--%>
    <%--                                          placeholder="검색어 입력...">--%>
    <input type="text" id="searchBox" class="form-control" placeholder="검색어 입력...">
</div>

<!-- 게시글이 없을 경우 메시지 출력 -->
<c:if test="${empty postList}">
    <p class="text-center text-danger">게시글이 없습니다.</p>
</c:if>

<!-- 게시글 리스트 (테이블 유지) -->
<table class="table table-hover table-bordered">
    <thead class="table-dark">
    <tr>
        <th>제목</th>
        <th>내용</th>
        <%--        <th>작성자</th>--%>
        <%--        <th>작성일</th>--%>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="post" items="${postList}">
        <tr>
            <td>${post.title}</td>
            <td>${post.content}</td>
                <%--            <td>${post.writer}</td>--%>
                <%--            <td>${post.date}</td>--%>
        </tr>
    </c:forEach>
    </tbody>
</table>

<script src="${pageContext.request.contextPath}/resources/js/board.js"></script>
</body>
</html>
