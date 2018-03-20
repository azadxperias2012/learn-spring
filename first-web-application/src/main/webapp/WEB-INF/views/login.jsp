<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Yahoo!!!!!! from JSP</title>
</head>
<body>
	<% Date date = new Date(); %>
	<h1>
		<div>Current date is <%=date%></div>
		<div>My First JSP ${name}</div>
	</h1>
</body>
</html>