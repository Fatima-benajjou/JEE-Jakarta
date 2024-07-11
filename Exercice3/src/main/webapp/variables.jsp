<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 11/07/2024
  Time: 12:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="prenoms" type="java.util.ArrayList<java.lang.String>" scope="request" />
<jsp:useBean id="noms" type="java.util.ArrayList<java.lang.String>" scope="request" />
<jsp:useBean id="ages" type="java.util.ArrayList<java.lang.Integer>" scope="request" />

<html>
<head>
    <%@include file="WEB-INF/bootstrap.html"%>
    <title>Title</title>
</head>
<body>

<h1>Affichage de mon tableau </h1>

<%--Avec Scriplet JSP--%>

<table class="table table-success table-striped">
    <thead>
    <tr>
        <th scope="col">Prenom</th>
        <th scope="col">Nom</th>
        <th scope="col">Age</th>
    </tr>
    </thead>
    <tbody>
    <% for (int i = 0; i < prenoms.size(); i++) {%>
    <tr>
        <td><%= prenoms.get(i) %></td>
        <td><%= noms.get(i) %></td>
        <td><%= ages.get(i) %></td>
    </tr>
    <% }%>
    </tbody>
</table>
</body>
</html>
