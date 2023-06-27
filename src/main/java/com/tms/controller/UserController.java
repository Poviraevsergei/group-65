package com.tms.controller;

import com.tms.User;
import com.tms.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Writer;

public class UserController {
    UserService userService = new UserService();

    public void getUser(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        User user = userService.getUser(req);

        Writer writer = resp.getWriter();
        if (user != null) {
            writer.write("We fond out user!!");
        } else {
            writer.write("We don't have user!!");
        }
    }

    public void deleteUser(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        boolean result = userService.deleteUser(req);
        Writer writer = resp.getWriter();
        writer.write(result ? "We deleted user!!" : "We don't deleted user!!");
    }

    public void createUser(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        User user = userService.createUser(req);
        Writer writer = resp.getWriter();
        if (user != null){
            writer.write("User created!");
        } else {
            writer.write("User don't created!");
        }
    }
}