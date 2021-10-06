<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="Saludo.jsp" method="post">
		<label for="nombre">Nombre:</label>
		<input id="nombre" type="text" name="nombre" required><br>
		<button type="submit" name="submit">Enviar</button>
	</form>
</body>
</html>