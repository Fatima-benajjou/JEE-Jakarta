<%@ page import="org.example.tp_hopital.model.Patient" %>

<jsp:useBean id="patients" type="java.util.ArrayList<org.example.tp_hopital.model.Patient> " scope="request"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <%@include file="bootstrap.html" %>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gestion des Patients</title>
    <style>
        .btn-violet {
            background-color: #6a0dad;
            color: white;
        }

        .btn-dark-purple {
            background-color: #4b0082;
            color: white;
        }
        .login-container {
            max-width: 400px;
            margin: 50px auto;
            padding: 20px;
            border: 1px solid #ddd;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
    </style>
</head>

<%@ include file="/WEB-INF/header.html" %>

<body>
<div class="container mt-5">
    <h1 class="text-center mb-5">Gestion des Patients</h1>

    <div class="row mb-4">
        <div class="col-md-8 offset-md-2">
            <h3> Rechercher un patient </h3>
            <div class="input-group">
                <input type="text" class="form-control" placeholder="Rechercher un patient">
                <div class="input-group-append">
                    <button class="btn btn-violet" type="button">Valider</button>
                </div>
            </div>
        </div>
    </div>



    <div class="row mb-5">

        <div class="col-md-8 offset-md-2">

            <form action="${pageContext.request.contextPath}/connection" method="post">
            <div class="container">
                <div class="login-container">
                    <h2 class="text-center">Connexion</h2>
                    <form>
                        <div class="form-group">
                            <label for="identifier">Identifiant</label>
                            <input type="text" class="form-control" id="identifier" name ="identifier" placeholder="Entrer votre identifiant">
                        </div>
                        <div class="form-group">
                            <label for="password">Mot de passe</label>
                            <input type="password" class="form-control" id="password" name ="password" placeholder="Entrer votre mot de passe">
                        </div>
                        <div class="form-group text-right">
                            <button type="submit" class="btn btn-dark-purple">Se connecter</button>
                        </div>
                    </form>
                </div>
            </div>

                    <%if (session.getAttribute("islogged") != null && (boolean) session.getAttribute("islogged")) {%>

                <h3>Ajouter un Patient</h3>

    <form action="${pageContext.request.contextPath}/patient/listPatient" method="post">

        <div class="form-row justify-content-center">
        <div class="form-group col-md-3">
            <label for="lastName">Nom :</label>
            <input type="text" id="lastName" name="lastName">
        </div>
        <div class="form-group col-md-3">
            <label for="firstName"> Prénom :</label>
            <input type="text" id="firstName" name="firstName">
        </div>
        <div class="form-group col-md-3">
            <label for="birthDate">Date de Naissance :</label>
            <input type="date" id="birthDate" name="birthDate">
        </div>



        <button class="btn btn-violet">Valider</button>
        </div>
        <%}
        else {%>
        <h3> Liste des Patients </h3>
        <%}%>


        <br>
        <br>

    </form>

        </div>
    </div>

    <% if (!patients.isEmpty()) { %>
    <table class="table align-middle table-striped text-center">
        <thead>
        <tr>
            <th scope="col">Id</th>
            <th scope="col">Prénom</th>
            <th scope="col">Nom</th>
            <th scope="col">Date de Naissance</th>
            <th scope="col">Détail</th>


        </tr>
        </thead>
        <tbody>
        <% for (int i = 0; i < patients.size(); i++) {%>
        <tr>

            <td><%= patients.get(i).getId()%>
            </td>
            <td><%=patients.get(i).getFirstname()  %>
            </td>
            <td><%= patients.get(i).getLastname() %>
            </td>
            <td><%=patients.get(i).getBirthdate()  %>
            </td>
            <td><a href="${pageContext.request.contextPath}/patient/infoPatient?id=<%=patients.get(i).getId()%>"
                               class="btn btn-outline-primary">Détails</a></td>
        </tr>
        <% }%>
        </tbody>

    </table>
    <% } else { %>
    <p>Vous n'avez pas de Patients dans la liste</p>
    <% } %>
</div>

<%@ include file="/WEB-INF/footer.html" %>
</body>
</html>