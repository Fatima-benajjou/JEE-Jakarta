<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 12/07/2024
  Time: 13:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="chiens" type="java.util.ArrayList<org.example.exercice5.Chien>" scope="request" />
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <title>Chiens</title>
</head>
<body>
<header>
    <h1>Ajouter un Chien</h1>
</header>
<form action="${pageContext.request.contextPath}/chienServlet" method="post">
    <div>
        <label for="nom">Nom :</label>
        <input type="text" id="nom" name="nom" >
    </div>
    <div>
        <label for="race">Race :</label>
        <input type="text" id="race" name="race" >
    </div>

    <div>
        <label for="date">Date Naissance :</label>
        <input type="date" id="date" name="date" >
    </div>


    <button>Ajouter</button>

</form>



</body>
</html>
