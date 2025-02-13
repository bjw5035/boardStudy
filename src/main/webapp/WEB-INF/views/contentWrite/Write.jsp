<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CONTENT</title>
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/styles.css">
    <%--    <style>--%>
    <%--      table {--%>
    <%--        margin: auto;--%>
    <%--      }--%>

    <%--      input[type="text"] {--%>
    <%--        border: 1.5px rgb(68, 136, 244) solid;--%>
    <%--        width: 500px;--%>
    <%--        height: 30px;--%>
    <%--        border-radius: 5px;--%>
    <%--        padding-left: 10px;--%>
    <%--      }--%>

    <%--      textarea {--%>
    <%--        border: 1.5px rgb(68, 136, 244) solid;--%>
    <%--        width: 500px;--%>
    <%--        height: 400px;--%>
    <%--        border-radius: 5px;--%>
    <%--        padding-left: 10px;--%>
    <%--        padding-top: 10px;--%>
    <%--        resize: none;--%>
    <%--      }--%>

    <%--      .header {--%>
    <%--        height: 30px;--%>
    <%--      }--%>

    <%--      input[type="submit"] {--%>
    <%--        width: 100px;--%>
    <%--        height: 40px;--%>
    <%--        font-size: 15px;--%>
    <%--        border: 0;--%>
    <%--        outline: 1.5px rgb(68, 136, 244) solid;--%>
    <%--        border-radius: 5px;--%>
    <%--        padding-left: 10px;--%>
    <%--        background-color: rgb(164, 199, 255);--%>
    <%--      }--%>

    <%--      input[type="submit"]:active {--%>
    <%--        width: 100px;--%>
    <%--        height: 40px;--%>
    <%--        font-size: 15px;--%>
    <%--        border: 0;--%>
    <%--        border-radius: 5px;--%>
    <%--        outline: 1.5px rgb(27, 76, 155) solid;--%>
    <%--        padding-left: 10px;--%>
    <%--        background-color: rgb(68, 136, 244);--%>
    <%--      }--%>
    <%--    </style>--%>
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
            <textarea class="form-control" id="content" name="content" rows="6"
                      placeholder="내용을 입력하세요"></textarea>
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
