package com.tms;

import com.tms.controller.NewsController;
import com.tms.controller.UserController;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet("/*")
public class FrontController extends HttpServlet {

    UserController userController = new UserController();
    NewsController newsController = new NewsController();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getRequestURI();
        checkSecurity();
        loggingUrl(path);
        dispatcher(path, "GET", req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getRequestURI();
        checkSecurity();
        loggingUrl(path);
        dispatcher(path, "POST", req, resp);
    }

    void checkSecurity() {
        //logic for security
    }

    void loggingUrl(String uri) {
        System.out.println(LocalDateTime.now() + ": " + uri);
    }

    public void dispatcher(String path, String method, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        if ("GET".equals(method)) {
            switch (path) {
                case "/getUser" -> userController.getUser(req, resp);
                case "/getAllNews" -> newsController.getAllNews(req, resp);
                case "/getOneNews" -> newsController.getOneNews(req, resp);
            }
        }
        if ("POST".equals(method)) {
            switch (path) {
                case "/createUser" -> userController.createUser(req, resp);
                case "/deleteUser" -> userController.deleteUser(req, resp);
            }
        }
    }
}
