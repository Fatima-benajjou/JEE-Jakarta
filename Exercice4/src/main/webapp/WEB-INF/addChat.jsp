<%@ page import="org.example.exercice4.Chat" %><%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 11/07/2024
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="chats" type="java.util.ArrayList<org.example.exercice4.Chat>" scope="request"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="bootstrap.html"%>
    <title>Formulaire Chats</title>
</head>

<body>
<h1>Affichage de mon tableau </h1>

<%--Avec Scriplet JSP--%>

<table class="table">
    <thead>
    <tr>
        <th scope="col">Nom</th>
        <th scope="col">Race</th>
        <th scope="col">Repas</th>
        <th scope="col">Date Naissance</th>

    </tr>
    </thead>
    <tbody>
    <% for (Chat c : chats) {%>
    <tr>

        <td><%= c.getNom()%></td>
        <td><%= c.getRace()  %></td>
        <td><%= c.getRepas() %></td>
        <td><%= c.getDate()  %></td>
    </tr>
    <% }%>
    </tbody>
</table>
</body>


<form action="chatServlet" method="post">
    <div>
        <label for="nom">Nom :</label>
        <input type="text" id="nom" name="nom" >
    </div>
    <div>
        <label for="race">Race :</label>
        <input type="text" id="race" name="race" >
    </div>
    <div>
        <label for="repas">Repas :</label>
        <input type="text" id="repas" name="repas" >
    </div>
    <div>
        <label for="date">Date Naissance :</label>
        <input type="date" id="date" name="date" >
    </div>


    <button>Ajouter</button>

</form>
</html>



