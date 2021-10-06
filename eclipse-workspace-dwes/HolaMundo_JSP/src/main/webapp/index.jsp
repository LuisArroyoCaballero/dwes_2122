<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import= "java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>La hora actual es: <%= new Date() %></h3>
	<ul>
	<%
		for (int i = 0; i <= 100; i++) {
			response.getWriter().println("<li>"+i+"</li>");
		}
	%>
	</ul>
</body>
</html>