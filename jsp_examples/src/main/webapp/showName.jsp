<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Names</title>
</head>
<body>
<%@include file="menu.html" %>
<%=session.isNew() %>
<%=session.getId() %>
<h2>List of Names</h2>
<c:out value="${name} ${location}"/>
<% session.invalidate();%>
<a href="fourth.jsp">Next</a>

</body>
</html>