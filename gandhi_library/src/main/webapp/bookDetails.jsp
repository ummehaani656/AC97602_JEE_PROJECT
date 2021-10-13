<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<Style>
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
text-align:center;
color:red;}

</style>
</head>
<body>
<h2>Book Details</h2>
<table>
	<tr><th>Book ID</th>
	<th>Book Name</th>
	<th>Book Author</th>
	</tr>
	<tr><td>${foundBook[0].getBookId()}</td>
	<td>${foundBook[0].getBookName()}</td>
	<td>${foundBook[0].getAuthor()}</td></tr>
	<tr>
	<td>${foundBook[1].getBookId()}</td>
	<td>${foundBook[1].getBookName()}</td>
	<td>${foundBook[1].getAuthor()}</td>
	</tr>
</table>
</body>
</html>