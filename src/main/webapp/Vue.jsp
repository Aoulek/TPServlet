<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String nom= request.getParameter("nom"); %>
<u1>
<li>Nom: <% out.println(nom); %></li>
<li>Protocole: <%= request.getProtocol() %></li>
</u1>

</body>
</html>