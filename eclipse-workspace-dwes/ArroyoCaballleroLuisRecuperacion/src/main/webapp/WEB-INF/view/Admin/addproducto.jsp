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
				<a href="${pageContext.request.contextPath}/Home" style="margin-right:10px">Inicio</a>
				<c:if test="${sessionScope.role=='admin'}">
					<a href="${pageContext.request.contextPath}/Admin/AddProduct" style="margin-right:10px">Añadir producto</a>
				</c:if>
			</p>
			
			
			<p>
				<a href="${pageContext.request.contextPath}/LogOut">Salir</a>
			</p>

	</header>

	<c:if test="${correcto==null}">

		<form method="post">
			<label for="productCode">Product Code</label> <input
				type="text" id="productCode" name="productCode" required><br>
			<div style="color: red">${errorProducto}</div>
			<label for="productName">Product Name</label> <input type="text"
				id="productName" name="productName" required><br> 
				<label for="productLine">Product Line</label> <select id="productLine" name="productLine">
				<c:forEach items="${productLines}" var="pl">
					<option value="${pl.productLine}">${pl.productLine}</option>
				</c:forEach>
			</select><br>
			<label for="productScale">Product Scale</label>
			<input type="text" id="productScale" name="productScale" required><br>
			<label for="productVendor">Product Vendor</label>
			<input type="text" id="productVendor" name="productVendor" required><br>
			<label for="productDescription">Product Description</label>
			<input type="text" id="productDescription" name="productDescription" required><br>
			<label for="stock">Stock</label>
			<input type="number" id="stock" name="stock" required><br>
			<label for="buyPrice">Buy Price</label>
			<input type="number" id="buyPrice" name="buyPrice" required><br>
			<label for="msrp">MSRP</label>
			<input type="number" id="msrp" name="msrp" required><br><br>
			
			<input type="submit" value="CREATE PRODUCT" />
		</form>
	</c:if>
	<c:if test="${correcto!=null}">
		<h1 style="color:green">Se ha insertado el producto correctamente</h1>
	</c:if>
	
	
</body>
</html>