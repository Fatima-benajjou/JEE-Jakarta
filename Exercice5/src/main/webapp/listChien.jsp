<jsp:useBean id="chiens" type="java.util.ArrayList<org.example.exercice5.Chien>" scope="request"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/WEB-INF/bootstrap.html"%>
    <title>Liste de Chiens</title>
</head>

<body>

    <%--Avec Scriplet JSP--%>
    <%--<main class="container">--%>
    <main class="container p-3 text-bg-dark rounded">
        <h1>Affichage Liste des Chiens </h1>

        <% if (!chiens.isEmpty()) { %>
            <table class="table table-dark text-center align-middle table-striped">
                <thead>
                <tr>
                    <th>#</th>
                    <th>Nom</th>
                    <th>Race</th>
                    <th>date de naissance</th>
                    <th>Actions</th>

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
<%--                    <td><a href="${pageContext.request.contextPath}/chien/detailChien?id=${chiens.getId()}" class="btn btn-outline-primary">Détails</a></td>--%>
                </tr>
                <% }%>
                </tbody>
            </table>
        <% } else { %>
            <p>Vous n'avez pas de Chiens dans la liste</p>
        <% } %>

        <a href="${pageContext.request.contextPath}/addChien.jsp" class="btn btn-outline-light"><i class="bi bi-plus-square"></i> Ajouter un chien</a>
   </main>
</body>
</html>