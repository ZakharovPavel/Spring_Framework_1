<%--
  Created by IntelliJ IDEA.
  User: Feejie
  Date: 27/10/19
  Time: 12:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First Spring MVC View</title>
</head>
<body>
<c:forEach items="${msgList}" var="msg">
    <h1>${msg.message}</h1>
</c:forEach>
</body>
</html>
