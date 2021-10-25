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
	<jsp:useBean id="reservaBean" class="org.iesalixar.servidor.model.Reserva" scope="request"></jsp:useBean>
	<h1 style="color:blue;">RESERVA CONFIRMADA</h1>
	<p>FECHA DE INICIO: <%= reservaBean.getFechaInicio()  %></p>
	<p>FECHA DE FINALIZACIÓN: <%=  reservaBean.getFechaFin()%></p>
	<p>NÚMERO DE PERSONAS: <%=  reservaBean.getNumeroPersonas()%></p>
	<p>SERVICIOS RESERVADOS: </p> <br>
	<%if (reservaBean.getCheckbox()!= null) {%>
		<ul>
		<% for (int i = 0; i < reservaBean.getCheckbox().length;i++) { %>
			<li><%= reservaBean.getCheckbox()[i] %></li>
		<% } %>
		</ul>
	<%} %>
</body>
</body>
</html>