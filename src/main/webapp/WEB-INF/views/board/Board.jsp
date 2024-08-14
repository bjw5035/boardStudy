<!DOCTYPE html>
<html>
<head>
  <title>Board</title>
</head>
<body>
<h1>Board</h1>
<table border="1">
  <thead>
  <tr>
    <th>Title</th>
    <th>Author</th>
    <th>Created At</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach var="post" items="${posts}">
    <tr>
      <td><a href="${pageContext.request.contextPath}/post/${post.id}">${post.title}</a></td>
      <td>${post.author}</td>
      <td>${post.createdAt}</td>
    </tr>
  </c:forEach>
  </tbody>
</table>
</body>
</html>
