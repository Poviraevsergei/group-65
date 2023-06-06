package com.tms.patterns.builder;

public class Main {
    public static void main(String[] args) {
        House house = new House.Builder()
                .setWallCount(4)
                .setFloorMaterial("Wood")
                .build();

        System.out.println(house);
    }
}
