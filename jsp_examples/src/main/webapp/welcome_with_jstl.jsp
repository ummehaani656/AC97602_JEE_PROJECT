<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome with JSTL</title>
</head>
<body>
<%@include file="menu.html" %>
<%=session.isNew() %>
<%=session.getId() %>
<c:set var="location" value="chennai" scope="page"/>
<c:set var="name" value="Haani" scope="page"/>
<!--<%! String name="Haani"; %> -->

<!-- <% out.println("Hello"); %> -->
<!--  <% out.println("I am from JSP!"); %>-->
<c:out value="${'hello'}"/>
<c:out value="${'Iam from JSP!'}"/>
<c:out value="${name} ${location}"/>
<a href="showName.jsp">Next</a>
</body>
</html>