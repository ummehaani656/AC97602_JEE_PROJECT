<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>
</head>
<body>
<div>
<form:form action="/addStudent" modelAttribute="command" method="post">
<div>
<label for="">RollNumber</label>
<form:input  path="rollNumber"/></div>
<form:errors path="rollNumber" cssStyle="color:red;"></form:errors>
<div>
<label for="">StudentName</label>
<form:input  path="studentName"/></div>
<form:errors path="studentName" cssStyle="color:red;"></form:errors> 

<div>
<label for="">Date Of Birth</label>
<form:input type="date" path="dateOfBirth"/></div>
<div>
<label for="">Mark Scored</label>
<form:input  path="markScored"/></div>
<div>
<input type="submit" value="Add"/>
</div>
</form:form>
</div>
</body>
</html>