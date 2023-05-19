package com.tms.filters;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter("/c65annotation")
public class MyFirstFilter implements Filter { //jakarta.servlet

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter 1 work!");
        filterChain.doFilter(servletRequest,servletResponse); //Important!
    }
}
