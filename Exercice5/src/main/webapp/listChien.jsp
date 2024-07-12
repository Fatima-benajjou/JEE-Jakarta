<jsp:useBean id="chiens" type="java.util.ArrayList<org.example.exercice5.Chien>" scope="request"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
            crossorigin="anonymous"></script>

    <title>Liste de Chiens</title>
</head>

<body>
<h1>Affichage de mon tableau </h1>

<%--Avec Scriplet JSP--%>
<%--<main class="container">--%>
<main class="container">
        <% if (!chiens.isEmpty()) { %>
    <table class="table table-dark text-center align-middle">
        <thead>
        <tr>
            <th>#</th>
            <th>Nom</th>
            <th>Race</th>
            <th>date de naissance</th>
        </tr>
        </thead>
        <tbody>
        <% for (int i = 0; i < chiens.size(); i++) {%>
        <tr>
            <td><%= i + 1 %>
            </td>
            <td><%= chiens.get(i).getNom()%>
            </td>
            <td><%= chiens.get(i).getRace()  %>
            </td>
            <td><%= chiens.get(i).getDate() %>
            </td>
        </tr>
        <% }%>
        </tbody>
    </table>
        <% } else { %>
    <p>Vous n'avez pas de Chiens dans la liste</p>
        <% } %>
</body>
</html>