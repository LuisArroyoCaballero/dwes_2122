<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="javax.servlet.http.Cookie"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="barra.jsp"></jsp:include>
	<%
	Cookie[] cookies = request.getCookies();
	Cookie cookie = null;
	for (int i = 0; i < cookies.length; i++) {
		if (cookies[i].getName() != null && cookies[i].getName().equals("curso")) {
			cookie = cookies[i];
		}
	}
	%>
	<span style="font-weight: bolder;">Datos Personales:</span>
	<p>
		Nombre:
		<%=session.getAttribute("name")%>
		<br> Apellidos:
		<%=session.getAttribute("lastName")%>
		<br> Email:
		<%=session.getAttribute("email")%><br> <br>
	</p>
	<span style="font-weight: bolder;">Curso seleccionado:</span>
	<p>
		Curso:
		<%=cookie.getValue()%>
	</p>
	<br>
	<span style="font-weight: bolder;">Modulos Matriculados:</span>
	<p>

		<%
		String[] selection = (String[]) session.getAttribute("selection");
		for (int i = 0; i < selection.length; i++) {
		%>
	
	<p>
		Modulo
		<%=i + 1%>:
		<%=selection[i]%></p>
	<%
	}
	%>
	</p>

</body>
</html>