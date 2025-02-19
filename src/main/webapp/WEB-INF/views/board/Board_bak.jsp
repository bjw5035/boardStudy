<%--
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
            <li><a class="dropdown-item text-danger" href="${pageContext.request.contextPath}/auth/Logout.jsp">🚪 로그아웃</a></li>
        </ul>
    </div>
</div>

<h1 class="text-center mb-4">게시판</h1>
<form action="${pageContext.request.contextPath}/Board/searchBox" method="get">
    <div class="search-bar-container">
        <label for="searchBox"></label>
        <input type="text" id="searchBox" name="searchBox" class="form-control search-box" placeholder="검색어 입력...">
        <button class="btn btn-outline-primary search-button ms-2" id="searchButton" type="submit">🔍 검색</button>
        <button class="btn btn-outline-dark write-button ms-2" id="write" name="btnWrite" type="button">📝 글쓰기</button>
    </div>
</form>

<c:if test="${empty postList}">
    <p class="text-center text-danger">게시글이 없습니다.</p>
</c:if>

<table class="table table-hover table-bordered">
    <thead class="table-dark">
    <tr>
        <th><label><input type="checkbox"></label></th>
        <th>No.</th>
        <th>제목</th>
        <th>내용</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="post" items="${postList}">
        <tr>
                &lt;%&ndash; //TODO 2025-02-18 체크박스 체크여부 확인 스크립트 필요&ndash;%&gt;
                &lt;%&ndash; //TODO 2025-02-18 게시글 삭제여부 알럿 필요 &ndash;%&gt;
            <td><a href="${pageContext.request.contextPath}/Board/btnDel"> </a></td>
            <td>${post.seq}</td>
            <td>${post.title}</td>
            <td>${post.content}</td>
            <td>
                    &lt;%&ndash;                <form action="Board/btnDel" method="post" id="deleteForm${post.seq}">&ndash;%&gt;
                    &lt;%&ndash;                    <input type="hidden" name="seq" value="${post.seq}">&ndash;%&gt;
                    &lt;%&ndash;                    <button type="button" onclick="">삭제</button>&ndash;%&gt;
                    &lt;%&ndash;                </form>&ndash;%&gt;
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
&lt;%&ndash;<button class="delete-button" name="btnDel" id="btnDel" onclick="">삭제</button>&ndash;%&gt;
&lt;%&ndash;<button type="submit" name="btnDelete" id="btnDelete" class="btn btn-outline-dark delete-button ms-2">삭제</button>&ndash;%&gt;

<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/board.js"></script>
</body>
</html>
--%>
