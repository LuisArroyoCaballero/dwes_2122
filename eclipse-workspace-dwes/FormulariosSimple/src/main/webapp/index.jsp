<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/Formularios" method="post">
		<p>
			<label for="simple">Introduzca su nombre: </label> <input id="simple"
				type="text" name="simple" />
		</p>
		<p>
			<label for="checkbox">Seleccione una o varias opciones: </label> <br>
			<input type="checkbox" value="A" name="checkbox">Opcion A <br>
			<input type="checkbox" value="B" name="checkbox">Opcion B <br>
			<input type="checkbox" value="C" name="checkbox">Opcion C <br>
			<input type="checkbox" value="D" name="checkbox">Opcion D <br>
		</p>
		<p>
			<select name="select" multiple>
				<option value="valor A">Seleccion A</option>
				<option value="valor B">Seleccion B</option>
				<option value="valor C">Seleccion C</option>
				<option value="valor D">Seleccion D</option>
			</select>
		</p>
		<p>
			<input type="submit" value="Enviar" />
		</p>
	</form>
</body>
</html>