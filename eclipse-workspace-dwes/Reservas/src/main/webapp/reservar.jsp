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
	<jsp:include page="barra.jsp"></jsp:include>
	<h1 style="color:blue;"><fmt:message key="bookData"/></h1>
	<form method="post">
		<p>
			<label for="fechaInicio"><fmt:message key="startDate"/></label> 
			<br>
			<input type="date" name="fechaInicio" required /> 
			<br>
			<label for="fechaFin"><fmt:message key="endingDate"/></label> 
			<br>
			<input type="date" name="fechaFin" required /> 
			<br>
			<label for="numeroPersonas"><fmt:message key="peopleNumber"/></label> 
			<br>
			<input type="number" name="numeroPersonas" required /> 
			<br>
		</p>
		<h3 style="color:blue;"><fmt:message key="services"/></h3>
		<p>
			<label for="checkbox"></label>
			<input type="checkbox" value="wifi" name="checkbox"><fmt:message key="wifi"/>
			<input type="checkbox" value="limpieza" name="checkbox"><fmt:message key="cleaning"/> <br>
			<input type="checkbox" value="toallas" name="checkbox"><fmt:message key="towels"/> 
			<input type="checkbox" value="rutaGuiada" name="checkbox"><fmt:message key="guidedTour"/> <br>
			<input type="checkbox" value="desayuno" name="checkbox"><fmt:message key="breakfast"/> 
			<input type="checkbox" value="sauna" name="checkbox"><fmt:message key="sauna"/> <br>
		</p>
		<input type="submit" value="RESERVAR" name="reservar" />
	</form>
</body>
</html>