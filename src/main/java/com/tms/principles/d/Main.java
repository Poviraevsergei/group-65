package com.tms.principles.d;

public class Main {
    public static void main(String[] args) {
        Car car = new Tesla();

        System.out.println(car.model);
        System.out.println(car.fuel);
        car.start();
        car.stop();
    }
}
