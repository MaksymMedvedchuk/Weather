<%--
  Created by IntelliJ IDEA.
  User: po1ak
  Date: 2/10/2023
  Time: 11:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="Person" scope="request" class="logic.Person"/>
    ${Person.age}



</body>
</html>
