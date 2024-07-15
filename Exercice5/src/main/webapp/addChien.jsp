<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 12/07/2024
  Time: 13:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<jsp:useBean id="chiens" type="java.util.ArrayList<org.example.exercice5.Chien>" scope="request" />--%>
<html>
<head>
    <%@include file="/WEB-INF/bootstrap.html"%>
    <title>Chiens</title>
</head>

<main class="container p-3 text-bg-dark rounded">
    <header>
        <h1>Ajouter un Chien</h1>
    </header>


    <%--<div class="col-8 offset-2 text-bg-dark p-3">--%>

    <form  class="text-bg-dark rounded p-3" action="${pageContext.request.contextPath}/chien/listChien" method="post">

        <%--    <div>--%>
        <%--        <label for="id">Id :</label>--%>
        <%--        <input type="number" id="id" name="id" >--%>
        <%--    </div>--%>
        <div class="input-group mb-3">
            <input class="form-control" type="text" aria-label="nom" placeholder="Nom" id="nom" name="nom" required>
        </div>
        <div>
            <label for="race">Race :</label>
            <input class="form-control" type="text" id="race" name="race" >
        </div>

        <div>
            <label for="date">Date Naissance :</label>
            <input class="form-control" type="date" id="date" name="date" >
        </div>


        <button > Ajouter </button>



    </form>
</main>

</html>
