<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mostrar Productos</title>
</head>
<body>
	<header
		style="background-color: #8BD2EC; text-decoration: none; display: flex; flex-flow: row wrap; justify-content: space-around">

		<p><a href="${pageContext.request.contextPath}/">Inicio</a></p>
		<h1>Zona de usuario</h1>
		<p><a href="${pageContext.request.contextPath}/LogOut">Salir</a></p>

	</header>



	<h1>Productos de la categoria ${productLine}</h1>

	<table>
		<thead>
			<tr>
				<th>Nombre</th>
				<th>Descripcion</th>
				<th>Fabricante</th>
				<th>Precio Compra</th>
				<th>Stock</th>
				<th>Opciones</th>

			</tr>
		</thead>
		<tbody>
			<c:forEach items="${productos}" var="producto">
				<tr>
					<td>${producto.productName}</td>
					<td>${producto.productDescription}</td>
					<td>${producto.productVendor}</td>
					<td>${producto.buyPrice}</td>
					<td>${producto.quantityInStock}</td>
					<td><a href="${pageContext.request.contextPath}/Home?product=${producto.productCode}">+</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<p>${error}</p>



</body>
</html>