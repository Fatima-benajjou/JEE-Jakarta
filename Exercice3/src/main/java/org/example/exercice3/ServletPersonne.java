package org.example.exercice3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet( name = "servletPersonne" , value = "/servletPersonne")
public class ServletPersonne extends HttpServlet {
    private List<Personne> personnes;

    @Override
    public void init() throws ServletException {
        personnes = new ArrayList<>();
        personnes.add(new Personne("BenAjjou", "Fatima", 30));
        personnes.add(new Personne("Van I", "Loic", 31));
        personnes.add(new Personne("Walle", "Loick", 32));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("personnes",personnes);
        req.getRequestDispatcher("/variables2.jsp").forward(req,resp);

    }
}
