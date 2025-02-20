<%@ page import="org.example.tp_hopital.model.Patient" %>
<%--<jsp:useBean id="consultations" type="java.util.ArrayList<org.example.tp_hopital.model.Consultation> " scope="request"/>--%>
<jsp:useBean id="patient" type = "org.example.tp_hopital.model.Patient" scope="request"/>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="en">
<head>
    <%@include file="bootstrap.html" %>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Informations sur le Patient</title>
    <style>
        .btn-dark-purple {
            background-color: #4b0082;
            color: white;
        }
        .patient-info {
            max-width: 300px;
        }
        .consultation-container {
            border: 1px solid #ddd;
            border-radius: 10px;
            padding: 20px;
            margin-bottom: 20px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
    </style>
</head>

<%@ include file="/WEB-INF/header.html" %>
<body>
<div class="container mt-5">

    <!-- Informations sur le patient -->

    <div class="row mb-4">
        <div class="col-12 col-md-4 patient-info">
            <h3>Informations du patient</h3>


            <p><strong>Nom:</strong><%= patient.getLastname()%></p>
            <p><strong>Prénom:</strong><%= patient.getFirstname()%></p>
            <p><strong>Date de Naissance:</strong><%= patient.getBirthdate()%></p>
            <p><a href="${pageContext.request.contextPath}/patient/detailPatient?id=${patient.getId()}">Détails Consultation</a></p>


                        </div>
                    </div>

                <%--    <!-- Formulaire pour ajouter une consultation -->--%>
<%--    <div class="row mb-4">--%>
<%--        <div class="col-12">--%>
<%--            <div class="consultation-container">--%>
<%--                <h3>Ajouter une consultation</h3>--%>
<%--                <form>--%>
<%--                    <div class="form-group">--%>
<%--                        <label for="consultationDetails">Détails de la consultation</label>--%>
<%--                        <textarea class="form-control" id="consultationDetails" rows="5" placeholder="Saisir les détails de la consultation"></textarea>--%>
<%--                    </div>--%>
<%--                    <div class="form-group text-left">--%>
<%--                        <button type="submit" class="btn btn-dark-purple">Valider</button>--%>
<%--                    </div>--%>
<%--                </form>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--    <h2> Listes des consultation</h2>--%>

<%--    <div class="row mb-4">--%>
<%--        <div class="col-12">--%>
<%--            <h3>Liste des consultations</h3>--%>
<%--            <table class="table table-striped">--%>
<%--                <thead>--%>
<%--                <tr>--%>
<%--                    <th scope="col">cons</th>--%>
<%--                    <th scope="col"><a href="${pageContext.request.contextPath}/patient/detailPatient?id=${patients.get(i).getId()}"--%>
<%--                                         class="btn btn-outline-primary">Détails</a>--%>
<%--                        Détails</th>--%>
<%--                </tr>--%>
<%--                </thead>--%>
<%--                <tbody>--%>


<%--                <tr>--%>
<%--                    <td>Date de la consultation 1</td>--%>
<%--                    <td>Consultation annuelle, tout est normal.</td>--%>
<%--                </tr>--%>
<%--                <tr>--%>
<%--                    <td>Date de la consultation 2</td>--%>
<%--                    <td>Suivi après traitement, amélioration notable.</td>--%>
<%--                </tr>--%>
<%--                </tbody>--%>
<%--            </table>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>


</body>
</html>
