<%@ page import="org.example.exercice3.Personne" %><%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 11/07/2024
  Time: 13:47
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="personnes" type="java.util.ArrayList<org.example.exercice3.Personne>" scope="request" />
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="WEB-INF/bootstrap.html"%>
    <title>Title</title>
</head>
<body>

<h1>Affichage de mon tableau </h1>

<%--Avec Scriplet JSP--%>

<table class="table">
    <thead>
    <tr>
        <th scope="col">Prenom</th>
        <th scope="col">Nom</th>
        <th scope="col">Age</th>
    </tr>
    </thead>
    <tbody>
    <% for (Personne p : personnes) {%>
    <tr>
        <td><%= p.getPrenom()  %></td>
        <td><%= p.getNom()%></td>
        <td><%= p.getAge() %></td>
    </tr>
    <% }%>
    </tbody>
</table>
</body>
</html>