<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form action="Forward.jsp" method="post">
		<%
		if (request.getParameter("error") != null && request.getParameter("error").equals("true")) {
		%>
			<h1 style = "color: red">ERROR: Usuario y contraseña incorrectos.</h1>
		<%
		}
		%>
		<label for="Usuario">Usuario: </label> <input id="Usuario" type="text"
			name="Usuario" required><br> <label for="Password">Password:
		</label> <input id="Password" type="text" name="Password" required><br>
		<button type="submit" name="submit">Enviar</button>
	</form>
</body>
</html>