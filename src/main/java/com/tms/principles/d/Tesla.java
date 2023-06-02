package com.tms.principles.d;

public class Tesla extends Car {

    public Tesla() {
        model = "Tesla";
        fuel = "Electro";
    }

    @Override
    public void start() {
        System.out.println("Старт Тесла");
    }

    @Override
    public void stop() {
        System.out.println("Стоп Тесла");
    }
}
