<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post">
		<label for="nota1">Primera nota:</label> 
		<input name="nota1" type="number" id="nota1" /> 
		<label for="nota2">Segunda nota:</label>
		<input name="nota2" type="number" id="nota2" /> 
		<label for="nota3">Tercera nota:</label> 
		<input name="nota3" type="number" id="nota3" /> 
		<input type="submit" value="Calcular">
	</form>
	<%
	if (request.getMethod().equals("POST")) {
		int nota1 = Integer.parseInt(request.getParameter("nota1"));
		int nota2 = Integer.parseInt(request.getParameter("nota2"));
		int nota3 = Integer.parseInt(request.getParameter("nota3"));
		double media = (nota1 + nota2 + nota3) / 3;
	%>

	<h1>
		La nota media es: <%= media %>
	</h1>
	<%
	}
	%>
</body>
</html>