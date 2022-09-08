<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: solomonchow
  Date: 5/9/2022
  Time: 1:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Course Form</title>
    <style>
        .error {
            color: red;
        }
    </style>
</head>
<body>
    <form:form action="processform" modelAttribute="course" >
        Course Name: <form:input path="courseName"/>
        <form:errors path="courseName" cssClass="error" />
        <br><br>
        Course Code: <form:input path="courseCode"/>
        <form:errors path="courseCode" cssClass="error" />
        <br><br>
       <input type="submit" value="Submit">
    </form:form>
</body>
</html>
