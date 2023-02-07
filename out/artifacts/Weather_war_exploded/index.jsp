<%--
  Created by IntelliJ IDEA.
  User: po1ak
  Date: 2/2/2023
  Time: 10:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<form name="loginForm" method="POST" action="controller">
  <input type="hidden" name="command" value="login" />
  Login:<br/>
  <input type="text" name="login" value=""/>
  <br/>Password:<br/>
  <input type="password" name="password" value=""/>
  <br/>
  ${errorLoginPassMessage}
  <br/>
  ${wrongAction}
  <br/>
  ${nullPage}
  <br/>
  <input type="submit" value="Log in"/>
</form><hr/>
  </body>
</html>
