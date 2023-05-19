package com.tms;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/c65annotation")
public class FirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html"); //как браузеру отобразить полученную информацию
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<h1> HELLO WORLD! From c65 </h1>");

        //create request attribute
        req.setAttribute("name", "Bill Gates");

        req.getRequestDispatcher("/WEB-INF/pages/main.jsp").forward(req, resp);
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