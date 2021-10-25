<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% if (session.isNew()) {
		%>
	
	<h1 style="color:blue;">CENTRAL DE VIAJES</h1>
	<form method="post">
		<p>
			<label for="user">Usuario </label> 
			<br>
			<input type="text" name="user" required /> 
			<br>
			<label for="password">Password </label> 
			<br>
			<input type="text" name="password" required /> 
			<br>
			<label for="confirmPassword">Confirmar Password </label> 
			<br>
			<input type="text" name="confirmPassword" required /> 
			<br>
			<label for="email">Email </label>
			<br> 
			<input type="email" name="email" required />
			<br>
		</p>
		<input type="submit" value="REGISTRARSE" name="signIn">
	</form>
	<%} else if (!session.isNew()) { %>
	
	<%} %>
	
</body>
</html>