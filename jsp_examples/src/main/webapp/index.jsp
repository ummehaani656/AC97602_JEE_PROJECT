<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index page</title>
</head>
<body>
<%@include file="menu.html" %>
<a href="welcome_with_jstl.jsp">Continue</a>
<%=session.isNew() %>
<%=session.getId() %>
</body>
</html>