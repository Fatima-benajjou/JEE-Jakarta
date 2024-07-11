package org.example.exercice2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "servletTableau", value = "/servletTableau")
public class ServletTableau extends HttpServlet {

    private List<String> prenoms;
    private List<String> noms;
    private List<Integer> ages;

    @Override
    public void init() {
        prenoms = new ArrayList<>();
        prenoms.add("Fa");
        prenoms.add("Fati");
        prenoms.add("Fatima");
        noms = new ArrayList<>();
        noms.add("Ben");
        noms.add("Bena");
        noms.add("Benajjou");
        ages = new ArrayList<>();
        ages.add(20);
        ages.add(30);
        ages.add(40);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        req.setAttribute("prenoms",prenoms);
        req.setAttribute("noms",noms);
        req.setAttribute("ages",ages);
        req.getRequestDispatcher("/variables.jsp").forward(req,resp);
    }
}
