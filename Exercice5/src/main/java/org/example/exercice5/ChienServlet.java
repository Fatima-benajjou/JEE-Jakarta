package org.example.exercice5;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.time.LocalDate;

@WebServlet(name = "ChienServlet", value = "/chien/*")
public class ChienServlet extends HttpServlet {
    private List<Chien> chiens;

    @Override
    public void init() throws ServletException {
        chiens = new ArrayList<>();
        chiens.add(new Chien("toto","troto", LocalDate.now()));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        String pathInfo = req.getPathInfo();
//        switch (pathInfo) {
//            case "/list":
//                req.setAttribute("chiens", chiens);
//                req.getRequestDispatcher("/list.jsp").forward(req, resp);
//                break;
//            case "/add":
//                req.getRequestDispatcher("/add.jsp").forward(req, resp);
//                break;
//            case "/details":
//                req.getRequestDispatcher("/details.jsp").forward(req, resp);
//                break;
//        }

        req.setAttribute("chiens", chiens);
        req.getRequestDispatcher("/listChien.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nom = req.getParameter("nom");
        String race = req.getParameter("race");
        LocalDate date = LocalDate.parse(req.getParameter("date"));

        Chien chien = new Chien(nom, race, date);
        chiens.add(chien);
        doGet(req, resp);
    }
}
