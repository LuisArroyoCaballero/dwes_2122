<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Empleado</title>
</head>
<body>

	<header
			style="background-color: #8BD2EC; text-decoration: none; display: flex; flex-flow: row wrap; justify-content: space-around">

			<p>
				<a href="${pageContext.request.contextPath}/" style="margin-right:10px">Inicio</a><a
					href="${pageContext.request.contextPath}/Admin/Empleados" style="margin-right:10px">Mostrar
					Empleados</a><a
					href="${pageContext.request.contextPath}/Admin/AddEmpleado">Añadir
					Empleado</a>
			</p>
			<h1>Zona de Administrador</h1>
			<p>
				<a href="${pageContext.request.contextPath}/LogOut">Salir</a>
			</p>

		</header>



	<form method="post">
		<label for="employeeNumber">Numero de Empleado</label> <input
			type="text" id="employeeNumber" name="employeeNumber" required><br>
		<div style="color: red">${errorEmpleado}</div>
		<label for="lastName">Apellidos</label> <input type="text"
			id="lastName" name="lastName" required><br> <label
			for="firstName">Nombre</label> <input type="text" id="firstName"
			name="firstName" required> <br><label for="extension">Extension</label>
		<input type="text" id="extension" name="extension" required><br>

		<label for="mail">Email</label> <input type="text" id="mail"
			name="mail" required><br> <label for="jobTitle">Puesto</label>
		<input type="text" id="jobTitle" name="jobTitle" required><br> 
		<label for="officeCode">Oficina</label> 
			<select id="officeCode" name="officeCode">
			<c:forEach items="${oficinas}" var="o">
				<option value="${o.officeCode}">${o.city}</option>
			</c:forEach>
		</select><br> <label for=jefe>Jefe</label> <select id="jefe" name="jefe">
			<c:forEach items="${empleados}" var="e">
				<option value="${e.employeeNumber}">${e.firstName}
					${e.lastName}</option>
			</c:forEach>
		</select> <input type="submit" value="AÑADIR" />
	</form>

	
	<c:forEach items="${oficinas}" var="a">
				<p>${o.city}</p>
			</c:forEach>
	
</body>
</html>