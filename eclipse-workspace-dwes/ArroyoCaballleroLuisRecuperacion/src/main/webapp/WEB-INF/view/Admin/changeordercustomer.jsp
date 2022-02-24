<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
	<h1>Change Product Customer</h1>
	<h3>Order Code: ${order.orderNumber}</h3>
	<form method="post">
		<label for="customerNumber">CUSTOMER</label>
		<select id="customerNumber" name="customerNumber">
			<c:forEach items="${customers}" var="c">
				<c:choose>
					<c:when test="${c.customerNumber == order.customerNumber }">
						<option value="${c.customerNumber}" selected>${c.customerName}</option>
					</c:when>
					<c:otherwise>
						<option value="${c.customerNumber}">${c.customerName}</option>
					</c:otherwise>
				</c:choose>
			</c:forEach>
		</select><br>
		<input type="number" id="orderNumber" name="orderNumber" value="${order.orderNumber }" hidden="true">
		<input type="submit" value="CHANGE CUSTOMER">
	</form>
	<h1 style="color:green">Se ha insertado el producto correctamente</h1>
</body>
</html>