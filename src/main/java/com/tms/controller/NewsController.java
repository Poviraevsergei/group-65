package com.tms.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Writer;

public class NewsController {

    public void getAllNews(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //logic for find all news...
        //connect to db and get news
        Writer writer = resp.getWriter();
        writer.write("We found all news!!");
    }

    public void updateNews(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //logic for update news...
        //connect to db and update news
        Writer writer = resp.getWriter();
        writer.write("We update all news!!");
    }
}
