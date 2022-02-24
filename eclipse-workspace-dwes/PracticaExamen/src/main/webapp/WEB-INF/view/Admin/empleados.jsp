<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Empleados</title>
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


	<p>
		<a href="${pageContext.request.contextPath}/Admin/AddEmpleado">Añadir
			empleado</a>
	</p>
	<h1>Empleados</h1>

	<table>
		<thead>
			<tr>
				<th>Número</th>
				<th>Apellidos</th>
				<th>Nombre</th>
				<th>Puesto</th>
				<th>Oficina</th>
				<th>Jefe</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${employees}" var="empleado">
				<tr>
					<td>${empleado.employeeNumber}</td>
					<td>${empleado.lastName}</td>
					<td>${empleado.firstName}</td>
					<td>${empleado.jobTitle}</td>
					<td>${empleado.officeCode}</td>
					<td>${empleado.reportsTo}</td>

				</tr>
			</c:forEach>
		</tbody>
	</table>
	<p>${error}</p>



</body>
</html>