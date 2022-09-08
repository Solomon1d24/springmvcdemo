<%--
  Created by IntelliJ IDEA.
  User: solomonchow
  Date: 25/8/2022
  Time: 9:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Hello World - Input Form</title>
</head>
<body>
    <form action="processFormVersionThree" method="GET">
        <input type="text" name="studentName" placeholder="What is your name?"/>
        <input type="submit"/>
    </form>
</body>
</html>