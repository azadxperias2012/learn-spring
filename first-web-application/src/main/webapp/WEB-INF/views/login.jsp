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
	</h1>
	
	<form action="/login" method="post">
		<p><font color="red">${errorMessage}</font></p>
		Name: <input type="text" name="name" />
		Password: <input type="password" name="password" />
		<input type="submit" value="Login" />
	</form>
</body>
</html>