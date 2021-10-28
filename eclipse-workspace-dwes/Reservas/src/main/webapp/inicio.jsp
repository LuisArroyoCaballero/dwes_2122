<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<fmt:setBundle basename="interface" />
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% if (session.isNew()) {
		%>
	
	<h1 style="color:blue;">CENTRAL DE VIAJES</h1>
	<form method="post">
		<p>
			<label for="user"><fmt:message key="user"/> </label> 
			<br>
			<input type="text" name="user" required /> 
			<br>
			<label for="password"><fmt:message key="password"/> </label> 
			<br>
			<input type="text" name="password" required /> 
			<br>
			<label for="confirmPassword"><fmt:message key="confirmPassword"/></label> 
			<br>
			<input type="text" name="confirmPassword" required /> 
			<br>
			<label for="email"><fmt:message key="email"/> </label>
			<br> 
			<input type="email" name="email" required />
			<br>
		</p>
		<input type="submit" value="REGISTRARSE" name="signIn">
	</form>
	<%} else if (!session.isNew()) { %>
		<jsp:include page="barra.jsp"></jsp:include>
		<img alt="Imagen_Albacete" src="img/Albacete.png">
	<%} %>
	
</body>
</html>