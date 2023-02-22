<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Weather</title>
</head>
<style>
    div {
        background-color: darkseagreen;
        border: 3px solid black;
        margin-top: 275px;
        position: relative;
        text-align: center;
        font-family: sans-serif;
        font-size: 25px;
        font-weight: bold;
        color: black;
    }
</style>
<body>
<div>
    <form action="${pageContext.request.contextPath}/weather" method="post">
        <br/>
        <jsp:include page="selectOption.jsp"/>
        <br/><br/>
        <jsp:include page="selectMonth.jsp"/>
        <br/><br/>
        <input type="submit" value="Get result"
               style="font-weight: bold; color: black; font-size: 25px; background-color: darkgray">
    </form>
</div>
</body>
</html>

