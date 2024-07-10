package Exercice;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "servletTextHTML", value = "/servlet-text-HTML")
public class ServletTextHTML extends HttpServlet {
    private String text;

    @Override
    public void init() throws ServletException {
        text = "Bonjour ça va ? en text brut ";
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        writer.println("<html><body>");
        writer.println("<h1>Je renvoie du texte simple !!!!!</h1>");
        writer.println("<h2>Bonjour " + text + "!!!!!</h2>");
        writer.println("</body></html>");

    }
}
