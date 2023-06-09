package com.tms.patterns.decorator;

public class JuniorDeveloper implements IDeveloper {
    @Override
    public void writeCode() {
        System.out.println("Writing simple code ...");
    }
}
