<%--
  Created by IntelliJ IDEA.
  User: fatim
  Date: 15/07/2024
  Time: 23:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="patients" type="java.util.ArrayList<org.example.tp_hopital.model.Patient> " scope ="request">
<html>
<head>
    <%@include file="bootstrap.html"%>
    <title>Title</title>
</head>


<body>
<main class = "container" >
<div class="mb-3">
    <label for="formGroupExampleInput" class="form-label">Recherche Patient par Nom </label>
    <input type="text" class="form-control" id="formGroupExampleInput" placeholder="Example input placeholder">
</div>

    <h3>Ajouter un Patient</h3>
    <form action="${pageContext.request.contextPath}/patient/" method="post">

        <div>
            <label for="lastName">Nom :</label>
            <input type="text" id="lastName" name="lastName" >
        </div>
        <div>
            <label for="firstName"> Prénom :</label>
            <input type="text" id="firstName" name="firstName" >
        </div>
        <div>
            <label for="birthDate">Date de Naissance :</label>
            <input type="date" id="birthDate" name="birthdate" >
        </div>


        <button>Ajouter</button>

    </form>

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


</main>
</body>
</html>
