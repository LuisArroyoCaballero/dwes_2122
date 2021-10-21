<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% if (session.isNew()) { %>
	<form method="post">
		<input type="submit" value="Entrar" name="Button" />
	</form>
	<% } else if (!session.isNew()) { %>
	
		<a href="Logout"><input type="submit" value="Salir" /></a>
	
	<% } %>
</body>
</html>