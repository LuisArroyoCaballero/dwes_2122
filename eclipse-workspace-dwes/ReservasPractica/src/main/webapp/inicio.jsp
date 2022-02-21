<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>INICIO</h1>
	<% if (session.isNew()) { %>
	<h1>CENTRAL DE VIAJES</h1>
	<form method="post">
		<label for="user">Usuario:</label>
		<input name="user" id="user" type="text" required />
		<br>
		<label for="password">Contraseña:</label>
		<input name="password" id="password" type="password" required />
		<br>
		<label for="confirmPass">Confirmar contraseña:</label>
		<input name="confirmPass" id="confirmPass" type="password" required />
		<br>
		<label for="email">Correo electrónico:</label>
		<input name="email" id="email" type="email" required />
		<br>
		<input type="submit" value="Registrar" name="Sign In">
	</form>
	<% } else { %>
	<jsp:include page="barra.jsp"></jsp:include>
	<img alt="Imagen" src="/img/Captura_1.png"></img>
	<% } %>
</body>
</html>