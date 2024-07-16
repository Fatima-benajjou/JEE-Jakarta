package org.example.tp_hopital.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "connectionServlet", value = "/connection")
public class ConnectionServlet extends HttpServlet {

   // private String identifier = "fatima";
   // private String password = "fatima";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("connection.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("form recu");

        if (req.getParameter("identifier").equals("fatima") && req.getParameter("password").equals("fatima")) {
            HttpSession session = req.getSession();
            session.setAttribute("islogged", true);
            System.out.println("vous etes connecté");

        }
        resp.sendRedirect("patient/listPatient");


    }

}

