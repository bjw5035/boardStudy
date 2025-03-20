<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>게시판</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/styles.css">
    <script defer src="${pageContext.request.contextPath}/resources/js/board.js"></script>
</head>
<body class="container-fluid py-5">
<c:forEach var="post" items="${postList}">
    <span>${post.userName}, 환영합니다!</span>
</c:forEach>

<!-- 계정 설정 드롭다운 -->
<div class="d-flex justify-content-end">
    <div class="dropdown">
        <button class="btn btn-outline-secondary dropdown-toggle" type="button" id="accountDropdown"
                data-bs-toggle="dropdown" aria-expanded="false">
            👤 계정 설정
        </button>
        <ul class="dropdown-menu" aria-labelledby="accountDropdown">
            <li><a class="dropdown-item" href="MyPage.jsp">🛠 마이페이지</a></li>
            <li><a class="dropdown-item text-danger" href="${pageContext.request.contextPath}/auth/Logout.jsp">🚪 로그아웃</a></li>
        </ul>
    </div>
</div>

<!-- 검색 및 글쓰기 버튼 -->
<div class="d-flex justify-content-between my-3">
    <form action="${pageContext.request.contextPath}/Board/searchBox" method="get" class="d-flex">
        <label>
            <input type="text" name="searchBox" class="form-control me-2" placeholder="검색어 입력" required>
        </label>
        <button type="submit" class="btn btn-board-primary">🔍 검색</button>
    </form>
    <button class="btn btn-success write-button ms-2" id="write" name="btnWrite">📝 글쓰기</button>
</div>

<!-- 게시글 리스트 -->
<table class="table table-hover">
    <thead class="table-dark">
    <tr>
        <th>번호</th>
        <th>제목</th>
        <th>내용</th>
        <th>작성자</th>
        <th>작성일</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="post" items="${postList}">
        <tr>
            <td>${post.seq}</td>
            <td><a href="${pageContext.request.contextPath}/Board/Detail?seq=${post.seq}">${post.title}</a></td>
            <td>${post.content}</td>
            <td>${post.userName}</td>
            <td>${post.createTime}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<!-- 페이지네이션 -->
<div class="d-flex justify-content-center">
    <c:if test="${currentPage > 1}">
        <a href="?page=${currentPage - 1}" class="btn btn-outline-primary me-2">⬅ 이전</a>
    </c:if>
    <c:if test="${currentPage < totalPages}">
        <a href="?page=${currentPage + 1}" class="btn btn-outline-primary">다음 ➡</a>
    </c:if>
</div>

</body>
</html>
