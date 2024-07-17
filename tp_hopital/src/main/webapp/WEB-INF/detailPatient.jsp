<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 16/07/2024
  Time: 13:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="patient" type = "org.example.tp_hopital.model.Patient" scope="request"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <%@include file="bootstrap.html" %>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Détails de la Consultation</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .btn-dark-purple {
            background-color: #4b0082;
            color: white;
        }
        .large-textarea {
            height: 200px;
        }


    </style>
</head>

<%@ include file="/WEB-INF/header.html" %>
<body>
<div class="container mt-5">
    <!-- Fiche de soins -->
    <div class="row mb-4">
        <div class="col-12">
            <h2>Fiche de soins</h2>
            <form>
                <div class="form-group">
                    <textarea class="form-control large-textarea" placeholder="Remplir la fiche de soins"></textarea>
                </div>
                <div class="form-group text-left">
                    <button type="submit" class="btn btn-dark-purple">Valider</button>
                </div>
            </form>
        </div>
    </div>

    <!-- Prescription -->
    <div class="row mb-4">
        <div class="col-12">
            <h2>Prescription</h2>
            <form>
                <div class="form-group">
                    <textarea class="form-control large-textarea" placeholder="Remplir la prescription"></textarea>
                </div>
                <div class="form-group text-left">
                    <button type="submit" class="btn btn-dark-purple">Valider</button>
                </div>
            </form>
        </div>
    </div>
</div>

<%@ include file="/WEB-INF/footer.html" %>

</body>
</html>

