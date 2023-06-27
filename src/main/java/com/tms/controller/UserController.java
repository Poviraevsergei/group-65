package com.tms.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Writer;

public class UserController {

    public void getUser(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //logic for find User...
        //get id from path
        //connect to db and load user
        Writer writer = resp.getWriter();
        writer.write("We fond out user!!");
    }

    public void deleteUser(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //logic for deleting User...
        //get id from path
        //connect to db and delete user
        Writer writer = resp.getWriter();
        writer.write("We deleted user!!");
    }

    public void createUser(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //logic for creating user...
        Writer writer = resp.getWriter();
        writer.write("User created!");
    }

}
