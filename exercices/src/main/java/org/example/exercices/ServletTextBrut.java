package org.example.exercices;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "servletTextBrut", value = "/servlet-text-brut")
public class ServletTextBrut extends HttpServlet {
    private String text;

    @Override
    public void init() throws ServletException {
        text = "Bonjour ça va ? en text brut ";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/plain");
        PrintWriter writer = resp.getWriter();

        writer.println(text);

    }

    @Override
    public void destroy(){};
}
