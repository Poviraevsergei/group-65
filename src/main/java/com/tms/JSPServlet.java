package com.tms;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/jsp-example")
public class JSPServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Достали из пути name=?
        String servletName = req.getParameter("name");

        //Положим переменную в контекст
        req.setAttribute("name", servletName);

        //Сделали перенаправление на jsp страницу
        req.getRequestDispatcher("/JavaServerPage.jsp").forward(req, resp);
    }
}
