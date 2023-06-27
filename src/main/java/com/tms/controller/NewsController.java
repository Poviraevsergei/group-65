package com.tms.controller;

import com.tms.service.NewsService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class NewsController {

    NewsService newsService = new NewsService();

    public void getAllNews(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ArrayList<String> allNews = newsService.getAllNews(req);
        Writer writer = resp.getWriter();
        writer.write("We found all news!!" + allNews);
    }

    public void getOneNews(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String oneNews = newsService.getOneNews(req);
        Writer writer = resp.getWriter();
        writer.write("We update all news!!" + oneNews);
    }
}
