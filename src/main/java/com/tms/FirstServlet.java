package com.tms;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/c65annotation")
public class FirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html"); //как браузеру отобразить полученную информацию

        HttpSession session = req.getSession(); //Cookie name=Vaserman
        String name = (String) session.getAttribute("name"); //null
        PrintWriter writer = resp.getWriter();
        if (name == null) {
            session.setAttribute("name", "Vaserman"); //name -> Vaserman
            writer.print("Hello, I don't know why are you....");
        } else {
            writer.print("Hello my dear " + session.getAttribute("name"));
        }
        req.getRequestDispatcher("/WEB-INF/pages/my-first-html.html").forward(req, resp);
    }

    //Жизненный цикл
    //1. init() - когда мы к нему обращается 1 раз
    //2. service() - выполняется каждый раз при вызове сервлета
    //3. destroy() - когда приложение умирает
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Init method");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        System.out.println("Service method");
    }

    @Override
    public void destroy() {
        System.out.println("Destroy method");
    }
}