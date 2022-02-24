<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form method="post">
		<label for="email">Correo electrónico: </label>
		<input type="text" id="email" name="email" required /> 
		<br>
		<label for="password">Contraseña: </label>
		<input type="password" id="password" name="password" required /> 
		<br>
		<c:if test="${error!=null}">
			<p style="color: red;">${error}</p>
		</c:if>
		<br>
		<input type="submit" value="ENTRAR" />
	</form>
</body>
</html>