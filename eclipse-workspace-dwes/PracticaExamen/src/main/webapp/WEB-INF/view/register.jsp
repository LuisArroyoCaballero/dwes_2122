<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<form method="post">
		<label for="usuario">Nombre de Usuario: </label>
		<input type="text" name="usuario" id="usuario" required />
		<br>
		<label for="email">Correo electrónico: </label>
		<input type="email" name="email" id="email" required />
		<br>
		<label for="password">Contraseña: </label>
		<input type="password" name="password" id="password" required />
		<br>
		<label for="firstName">Nombre: </label>
		<input type="text" name="firstName" id="firstName" required />
		<br>
		<label for="lastName">Apellido: </label>
		<input type="text" name="lastName" id="lastName" required />
		<br>
		
		<input type="submit" value="Registrar" />
	</form>
</body>
</html>