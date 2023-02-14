<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<b></b>
    Select month <select>
    <c:forEach var="month" items="${months}">
        <option value="${month}">${month}</option>
    </c:forEach>
</select>
<br>
<br>
<br>
    Select option <select>
    <c:forEach var="option" items="${options}">
        <option value="${option}">${option}</option>
    </c:forEach>
</select>
</body>
</html>
