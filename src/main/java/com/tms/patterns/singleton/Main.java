package com.tms.patterns.singleton;

public class Main {
    public static void main(String[] args) {
        Belaz belaz = Belaz.createBelaz(100,5);
        System.out.println(belaz.cost);


        Belaz belaz2 = Belaz.createBelaz(200,5);
        System.out.println(belaz2.cost);
    }
}
