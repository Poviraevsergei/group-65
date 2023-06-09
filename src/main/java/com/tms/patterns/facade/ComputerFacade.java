package com.tms.patterns.facade;

public class ComputerFacade {
    public Power power = new Power();
    public DvdRom dvdRom = new DvdRom();
    public DvdDecoder dvdDecoder = new DvdDecoder();

    public void copyFromDVDtoComputer() {
        power.on();
        dvdRom.open();
        dvdRom.close();
        dvdDecoder.copy();
        power.off();
    }
}
