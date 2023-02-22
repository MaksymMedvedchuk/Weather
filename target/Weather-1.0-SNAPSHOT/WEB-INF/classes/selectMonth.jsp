<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Month</title></head>
<body>
Select month <label for="currentMonth"></label>
<select id="currentMonth" name="currentMonth"
        style="background-color: darkgray; font-weight: bold; color: black; font-size: 25px">
    <c:forEach var="month" items="${months}">
        <option value="${month}">${month}</option>
    </c:forEach>
</select>
</body>
</html>
