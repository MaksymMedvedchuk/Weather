<%--
  Created by IntelliJ IDEA.
  User: po1ak
  Date: 2/14/2023
  Time: 12:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Select month <select>
    <c:forEach var="month" items="${months}">
        <option value="${month}">${month}</option>
    </c:forEach>
</select>
</body>
</html>
