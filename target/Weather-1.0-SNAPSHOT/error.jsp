<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
    String exception = pageContext.getException().getClass().toString();
    String message = pageContext.getException().getMessage();
%>
<html>
<head>
    <title>Exception</title>
</head>
<body>
<h2>Exception occurred while processing the request</h2>
<p>Type: <%= exception%>
</p>
<p>Message: <%= message %>
</p>
</body>
</html>
