<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show all</title>
<style type="text/css">

table, td, th {
  border: 3px solid blue;
  border-collapse: collapse;
  
}
body{
text-align:center;}
</style>
</head>
<body>
<table >
<tr>
<th>Roll Number</th>
<th>Student Name</th>
<th>Date of Birth</th>
<th>Mark Scored</th>
</tr>
<c:forEach items="${data}" var="eachItem">
<tr>
<td>${eachItem.rollNumber}</td>
<td>${eachItem.studentName}</td>
<td>${eachItem.dateOfBirth}</td>
<td>${eachItem.markScored}</td>
</tr>
</c:forEach>
</table>
</body>
</html>