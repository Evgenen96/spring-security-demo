<%--
  Created by IntelliJ IDEA.
  User: Евгений
  Date: 19.10.2020
  Time: 11:10
  To change
  this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Welcome home!</title>
</head>
<body>
<p> Hello World!</p>

<p> User: <security:authentication property="principal.username"/></p>
<p> Role: <security:authentication property="principal.authorities"/></p>

<form:form action="${pageContext.request.contextPath}/logout"
           method="POST">
    <input type="submit" value="logout"/>
</form:form>

</body>
</html>
