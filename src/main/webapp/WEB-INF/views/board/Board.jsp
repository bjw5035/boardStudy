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

<!-- 계정 설정 버튼을 최상단 우측으로 이동 -->
<div class="top-right">
    <div class="dropdown">
        <button class="btn btn-outline-secondary dropdown-toggle" type="button" id="accountDropdown"
                data-bs-toggle="dropdown" aria-expanded="false">
            👤 계정 설정
        </button>
        <ul class="dropdown-menu" aria-labelledby="accountDropdown">
            <li><a class="dropdown-item" href="MyPage.jsp">🛠 마이페이지</a></li>
            <li><a class="dropdown-item text-danger" href="Logout.jsp">🚪 로그아웃</a></li>
        </ul>
    </div>
</div>

<h1 class="text-center mb-4">게시판</h1>

<div class="search-bar-container">
    <input type="text" id="searchBox" class="form-control search-box" placeholder="검색어 입력...">
    <button class="btn btn-outline-primary search-button ms-2" id="searchButton" type="button">
        🔍 검색
    </button>
    <button class="btn btn-outline-dark write-button ms-2" id="write" name="btnWrite" type="button">
        📝 글쓰기
    </button>
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
