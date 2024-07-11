package org.example.exercice4;

import jakarta.servlet.ServletConfig;
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

@WebServlet("/chatServlet")
public class ChatServlet extends HttpServlet {
    private List<Chat> chats;

    public void init() throws ServletException {
        chats = new ArrayList<>();
        chats.add(new Chat("NomChat1", "RaceChat1", "croquette", LocalDate.now()));
        chats.add(new Chat("NomChat2", "RaceChat2", "croquette2", LocalDate.now()));
        chats.add(new Chat("NomChat3", "RaceChat3", "croquette3", LocalDate.now()));
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("chats", chats);
        req.getRequestDispatcher("/WEB-INF/addChat.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nom = req.getParameter("nom");
        String race = req.getParameter("race");
        String repas = req.getParameter("repas");
        LocalDate date = LocalDate.parse(req.getParameter("date"));


    }
}
