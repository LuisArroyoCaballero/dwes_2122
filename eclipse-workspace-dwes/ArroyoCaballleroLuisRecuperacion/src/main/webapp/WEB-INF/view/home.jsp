<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<fmt:setBundle basename="interface" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	
	<header
			style="background-color: #8BD2EC; text-decoration: none; display: flex; flex-flow: row wrap; justify-content: space-around">

			<p>
				<a href="${pageContext.request.contextPath}/Home" style="margin-right:10px">Inicio</a>
				<c:if test="${sessionScope.role=='admin'}">
					<a href="${pageContext.request.contextPath}/Admin/AddProduct" style="margin-right:10px">Añadir producto</a>
				</c:if>
			</p>
			
			
			<p>
				<a href="${pageContext.request.contextPath}/LogOut">Salir</a>
			</p>

	</header>
	
	
	<h1>Orders Table</h1>

	<table>
		<thead>
			<tr>
				<th>OrderNumber</th>
				<th>OrderDate</th>
				<th>ShippedDate</th>
				<th>Status</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${orderList}" var="order">
				<tr>
					<td>${order.orderNumber}</td>
					<td>${order.orderDate}</td>
					<td>${order.shippedDate}</td>
					<td>${order.status}</td>
					<c:if test="${sessionScope.role=='usuario'}">
						<td><a href="${pageContext.request.contextPath}/OrderReport">Informe</a></td>
					</c:if>
					<c:if test="${sessionScope.role=='admin'}">
						<td><a href="${pageContext.request.contextPath}/Admin/ChangeOrderCustomer?orderNumber=${order.orderNumber}">Editar</a></td>
					</c:if>
					

				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>