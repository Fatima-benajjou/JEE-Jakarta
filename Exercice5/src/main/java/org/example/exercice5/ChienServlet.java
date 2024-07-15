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
        chiens.add(new Chien( "toto", "troto", LocalDate.now()));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String pathInfo = req.getPathInfo().substring(1);
        System.out.println(pathInfo);
        System.out.println(chiens);
        switch (pathInfo) {
            case "listChien":
                System.out.println("passage du listChien");
                req.setAttribute("chiens", chiens);
                req.getRequestDispatcher("/listChien.jsp").forward(req, resp);
                break;
            case "addChien":
                req.getRequestDispatcher("/addChien.jsp").forward(req, resp);
                break;
            case "detailChien":
                String idChien = req.getParameter("id");
                Chien chien = chiens.get(Integer.parseInt(idChien));
                req.setAttribute("chien", chien);
                req.getRequestDispatcher("/detailChien.jsp").forward(req, resp);
                break;
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        int id = Integer.parseInt(req.getParameter("id"));
        String nom = req.getParameter("nom");
        String race = req.getParameter("race");
        LocalDate date = LocalDate.parse(req.getParameter("date"));
        System.out.println("chien crée");
        Chien chien = new Chien( nom, race, date);
        chiens.add(chien);

        doGet(req, resp);



    }
}
