<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Malla Reddy</title>
</head>
<body>
<h1>${majHeading}</h1>

<a href="addStudent">Add Student</a>
<a href="getAllStudents">Show All students</a>
<div>
<form action="/getBloodGroup" >
<label for="">Search By City</label>
<input type="text" name="search">
<input type="submit" ></form>
<br>
</div>

</body>
</html>