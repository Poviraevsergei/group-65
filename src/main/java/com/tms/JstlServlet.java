package com.tms;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/jstl")
public class JstlServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] names = {"Sasha", "Dima", "Anton"};
        req.setAttribute("arrayUsers", names);

        User user = new User(16, "Yakub");
        req.setAttribute("Yakub",user);

        req.getRequestDispatcher("/helloUser.jsp").forward(req, resp);
    }
}
