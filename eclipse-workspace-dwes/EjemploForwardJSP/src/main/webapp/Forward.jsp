<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forward</title>
</head>
<body>
	<%
	if (request.getParameter("Usuario").equals("usuario") && request.getParameter("Password").equals("usuario")) {
	%>
	<jsp:forward page="Usuario.jsp" />

	<%
	} else if (request.getParameter("Usuario").equals("admin") && request.getParameter("Password").equals("admin")) {
	%>

	<jsp:forward page="Admin.jsp" />

	<%
	} else {
	%>

	<jsp:forward page="Login.jsp">
		<jsp:param value="true" name="error" />
	</jsp:forward>

	<%
	}
	%>

</body>
</html>