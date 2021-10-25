<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="barra.jsp"></jsp:include>
	<h1 style="color:blue;">DATOS DE LA RESERVA</h1>
	<form method="post">
		<p>
			<label for="fechaInicio">Fecha de Inicio </label> 
			<br>
			<input type="date" name="fechaInicio" required /> 
			<br>
			<label for="fechaFin">Fecha de Fin </label> 
			<br>
			<input type="date" name="fechaFin" required /> 
			<br>
			<label for="numeroPersonas">Número de personas </label> 
			<br>
			<input type="number" name="numeroPersonas" required /> 
			<br>
		</p>
		<h3 style="color:blue;">SERVICIOS</h3>
		<p>
			<label for="checkbox"></label>
			<input type="checkbox" value="wifi" name="checkbox">Wifi
			<input type="checkbox" value="limpieza" name="checkbox">Limpieza <br>
			<input type="checkbox" value="toallas" name="checkbox">Toallas 
			<input type="checkbox" value="rutaGuiada" name="checkbox">Ruta guíada <br>
			<input type="checkbox" value="desayuno" name="checkbox">Desayuno 
			<input type="checkbox" value="sauna" name="checkbox">Sauna <br>
		</p>
		<input type="submit" value="RESERVAR" name="reservar" />
	</form>
</body>
</html>