<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post">
		<p>
			<label for="user">Usuario</label>
			<input name="user" type="text" required/>
		</p>
		<p>
			<label for="password">Contraseña</label>
			<input name="password" type="text" required/>
		</p>
		<input type="submit" value="Log In">
	</form>
</body>
</html>