<%--
  Created by IntelliJ IDEA.
  User: solomonchow
  Date: 27/8/2022
  Time: 10:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>The Student Form</title>
</head>
<body>
    <form:form action = "processform" modelAttribute="student" >
      <p>Please enter student's first name and last name</p>

      First Name : <form:input path="firstName"/>
      <br><br>
      Last Name  : <form:input path="lastName" />
      <br><br>
        <form:select path="country">
            <form:option value="Brazil" label="Brazil"/>
            <form:option value="France" label="France"/>
            <form:option value="Germany" label="Germany"/>
            <form:option value="India" label="India"/>
            <form:option value="Hong Kong" label="Hong Kong"/>
        </form:select>
      <br><br>
         <form:radiobuttons path="favouriteLanguage" items="${student.favouriteLanguageOption}" />
      <br><br>
         Linux <form:checkbox path="operatingSystem" value="Linux" />
         MacOS <form:checkbox path="operatingSystem" value="MacOS" />
         MS Windows <form:checkbox path="operatingSystem" value="MS Windows" />
       <input type="submit" value="Submit">
    </form:form>

</body>
</html>
