<%--
  Created by IntelliJ IDEA.
  User: solomonchow
  Date: 27/8/2022
  Time: 10:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Confirmation Page</title>
</head>
<body>
  <p>The student that has been confirmed: ${student.firstName} ${student.lastName} with nationality of ${student.country}</p>
  <p>The student's favourite programming language is ${student.favouriteLanguage}</p>
  <p>The student's operating system is ${student.operatingSystem}</p>
</body>
</html>
