<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="usuarioBean" class="org.iesalixar.servidor.model.Usuario" scope="request"></jsp:useBean>
	<p>Nombre: <%= usuarioBean.getUsuario() %></p>
	<p>Apellido: <%= usuarioBean.getApellido() %></p>
	<p>Direccion: <%= usuarioBean.getDireccion() %></p>
	<p>Edad: <%= usuarioBean.getEdad() %></p>
	<% String[] aficiones = usuarioBean.getAficiones();%>
	<p>Aficiones:</p>
	<% for (int i = 0; i < aficiones.length; i++) { %>
		<p><%= aficiones[i] %></p>
	<%} %>
</body>
</html>