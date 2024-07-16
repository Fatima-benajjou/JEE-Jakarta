package org.example.tp_hopital.controller;


import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.tp_hopital.model.Consultation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet (name ="consultationServlet", value ="/consultation/*")
public class ConsultationServlet extends HttpServlet {
    private List<Consultation> consultations;


    @Override
    public void init () throws ServletException {
        consultations = new ArrayList<>();
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }



}
