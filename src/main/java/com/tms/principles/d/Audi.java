package com.tms.principles.d;

public class Audi extends Car{

    public Audi() {
        model = "Audi";
        fuel = "Benzin";
    }

    @Override
    public void start() {
        System.out.println("Стартую как ауди");
    }

    @Override
    public void stop() {
        System.out.println("Останавлиюсь как ауди");
    }
}
