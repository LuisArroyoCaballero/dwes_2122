<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.ArrayList" import="java.util.Enumeration"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Lista de propiedades del bd.properties</h1>
	<ul>
		<% 
		ArrayList<String> listaPropiedades = (ArrayList<String>) request.getAttribute("propiedades");
		for (int i=0; i<=listaPropiedades.size();i++ ){
		 %>
		 	<li><%= listaPropiedades.get(i) %></li>
		 <%
		}
		 %>
		 
	</ul>

</body>
</html>