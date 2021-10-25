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
	<form method="post">
		<p>
			<label for="name">Nombre: </label>
			<input name="name" type="text" required/>
		</p>
		<p>
			<label for="lastName">Apellido: </label>
			<input name="lastName" type="text" required/>
		</p>
		<p>
			<label for="email">Email: </label>
			<input name="email" type="text" required/>
		</p>
		<p>
			<span>Seleccione su curso:</span>
			<input type="radio" name="curso" value="1ºDAW" checked/>
			<label for="curso" >Primero de DAW</label>
			<input type="radio" name="curso" value="2ºDAW" />
			<label for="curso" >Segundo de DAW</label>
		</p>
		<p>
			<select name="select" multiple required>
				<option>Seleccion A</option>
				<option>Seleccion B</option>
				<option>Seleccion C</option>
				<option>Seleccion D</option>
				<option>Seleccion E</option>
				<option>Seleccion F</option>
			</select>
		</p>
		<p>
			<input type="submit" name="matricula" value="Matricular">
		</p>
		
	</form>
</body>
</html>