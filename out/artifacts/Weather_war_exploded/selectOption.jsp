<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Option</title></head>
<body>
Select option <label for="currentOption"></label>
<select id="currentOption" name="currentOption"
        style="background-color: darkgray; font-weight: bold; color: black; font-size: 25px">
    <c:forEach var="option" items="${options}">
        <option value="${option}">${option}</option>
    </c:forEach>
</select>
</body>
</html>
