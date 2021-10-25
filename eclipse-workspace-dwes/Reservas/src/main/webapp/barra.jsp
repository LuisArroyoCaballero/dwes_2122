<a href="<%= request.getContextPath() %>"><i>Volver</i></a>
<a href="<%= request.getContextPath()+"/Logout" %>"><i>Salir</i></a> <br>
<hr>
<p>Ususario: <%= session.getAttribute("user") %> Sesion:  <%= session.getAttribute("date") %></p>