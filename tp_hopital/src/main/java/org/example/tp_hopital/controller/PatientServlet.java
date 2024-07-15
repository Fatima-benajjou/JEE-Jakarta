package org.example.tp_hopital.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.tp_hopital.model.Patient;
import org.example.tp_hopital.service.PatientService;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "patientServlet", value = "/patient/*")
public class PatientServlet extends HttpServlet {
    private PatientService patientService;
    private List<Patient> patients;

    @Override


    public void init() throws ServletException {
        patientService = new PatientService();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getPathInfo();
        switch (action) {
            case "/listPatient":
                request.setAttribute("patients", patients);
                request.getRequestDispatcher("/listPatient.jsp").forward(request, response);
        break;
//
//        case "/addPatient":
//            request.getRequestDispatcher("/addPatient.jsp").forward(request, response);
//        break;
//            case "/detailPatient":
//                int idPatient = Integer.parseInt(request.getParameter("id"));
//                Patient patient = patientService.getPatientById(idPatient);
//                request.setAttribute("patient", patient);
//                request.getRequestDispatcher("/detailPatient.jsp").forward(request, response);



        }
    }


}
