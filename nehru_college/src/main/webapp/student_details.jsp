<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
<style>
table{
border:2px solid black;
margin-left:auto;
margin-right:auto;
border-collapse:collapse;
}
tr,td,th{
border:2px solid blue;
}
h2{
text-align:center;}

</style>
</head>
<body>
<!-- 
+=>sibling
*=>cardinality
> =>child
() =>grouping
 -->
 <h2>Student Details</h2>
<table>
	<tr>
		<th>Sl.no</th>
		<th>Name</th>
		<th>Markscored</th>
		<c:forEach items="${foundStudent}" var="eachStudent" >
		<tr>
			<td>${eachStudent.id}</td>
			<td>${eachStudent.name}</td>
			<c:if test="${eachStudent.markScored<80}">
			<td style="color:red">${eachStudent.markScored}</td>
			</c:if>
			<c:if test="${eachStudent.markScored>=80}">
			<td>${eachStudent.markScored}</td>
			</c:if>
			</c:forEach>
		</tr>
	</tr>
</table>
</body>
</html>