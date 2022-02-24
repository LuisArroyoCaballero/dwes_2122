<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<fmt:setBundle basename="interface" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:if test="${sessionScope.role=='admin'}">
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

		<h2>Operaciones disponibles</h2>
		<ul>
			<li><a href="${pageContext.request.contextPath}/Admin/Empleados">Mostrar
					Empleados</a></li>
			<li><a
				href="${pageContext.request.contextPath}/Admin/AddEmpleado">Añadir
					Empleado</a></li>
		</ul>


	</c:if>
	<c:if test="${sessionScope.role=='usuario'}">

		<header
			style="background-color: #8BD2EC; text-decoration: none; display: flex; flex-flow: row wrap; justify-content: space-around">

			<p>
				<a href="${pageContext.request.contextPath}/">Inicio</a>
			</p>
			<h1>Zona de Administrador</h1>
			<p>
				<a href="${pageContext.request.contextPath}/LogOut">Salir</a>
			</p>

		</header>


		<h2>Categorías</h2>
		<ul>
			<c:forEach items="${productLineList}" var="pl">
				<li><a href="MostrarProductos?pl=${pl.productLine}">${pl.productLine}</a></li>
			</c:forEach>
		</ul>




	</c:if>


</body>
</html>