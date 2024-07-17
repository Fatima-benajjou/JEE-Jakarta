package org.example.tp_hopital.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.example.tp_hopital.model.Patient;
import org.example.tp_hopital.service.PatientService;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "patientServlet", value = "/patient/*")
public class PatientServlet extends HttpServlet {

    //    private PatientService patientService;
    private List<Patient> patients;

    @Override
    public void init() throws ServletException {
//        patientService = new PatientService();
        patients = new ArrayList<>();

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getPathInfo();
        HttpSession session = req.getSession();
        boolean logged = session.getAttribute("isLogged") != null && (boolean) session.getAttribute("isLogged");
        req.setAttribute("isLogged", logged);
        switch (action) {
            case "/listPatient":
                req.setAttribute("patients", patients);
                req.getRequestDispatcher("/WEB-INF/listPatient.jsp").forward(req, resp);
                break;

            case "/accueil":

                PrintWriter out = resp.getWriter();
                out.println("<html><body>");
                out.println("<h1>  Bienvenue dans l'accueil de l'hopital Blablabla </h1>");
                out.println("</body></html>");
                break;
            case "/detailPatient":
                int idPatient = Integer.parseInt(req.getParameter("id"));
                Patient patient = patients.get(idPatient);
                req.setAttribute("patient", patient);
                req.getRequestDispatcher("/WEB-INF/detailPatient.jsp").forward(req, resp);

                break;

            case "/infoPatient":
                int idPatientInfo =Integer.parseInt(req.getParameter("id"));
                Patient patientInfo = patients.get(idPatientInfo);
                req.setAttribute("patient", patientInfo);
                req.setAttribute("consultations", patientInfo.getConsultations());
                req.getRequestDispatcher("/WEB-INF/infoPatient.jsp").forward(req, resp);

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String lastName = req.getParameter("lastName");
        String firstName = req.getParameter("firstName");
        LocalDate birthDate = LocalDate.parse(req.getParameter("birthDate"));
//        patientService.create(lastName, firstName, birthDate);
//        resp.sendRedirect("listPatient");
        Patient patient = new Patient(firstName, lastName, birthDate);
        patients.add(patient);

        req.setAttribute("patients", patients);
        req.getRequestDispatcher("/WEB-INF/listPatient.jsp").forward(req, resp);
    }
}



