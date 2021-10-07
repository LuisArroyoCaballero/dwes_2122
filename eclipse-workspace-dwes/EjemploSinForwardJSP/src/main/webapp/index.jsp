<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	if (request.getMethod().equals("POST")) {

		if (request.getParameter("Usuario").equals("usuario") && request.getParameter("Password").equals("usuario")) {
	%>
	<jsp:forward page="usuario.jsp" />

	<%
	} else if (request.getParameter("Usuario").equals("admin") && request.getParameter("Password").equals("admin")) {
	%>

	<jsp:forward page="admin.jsp" />

	<%
	} else {
	%>

	<h1 style = "color:red">ERROR: Usuario y contraseña incorrectos.</h1>

	<%
	}

	}
	%>
	<form method="post">
		<label for="Usuario">Usuario: </label> <input id="Usuario" type="text"
			name="Usuario" required><br> <label for="Password">Password:
		</label> <input id="Password" type="text" name="Password" required><br>
		<button type="submit" name="submit">Enviar</button>
	</form>
</body>
</html>