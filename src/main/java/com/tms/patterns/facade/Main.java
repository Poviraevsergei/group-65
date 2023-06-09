package com.tms.patterns.facade;

public class Main {
    public static void main(String[] args) {
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.copyFromDVDtoComputer();

        computerFacade.power.on();
    }
}
