package com.company;

public class Computer extends ECM {
    Processor processor = new Processor(2400, "Proc. Company");
    Motherboard motherboard = new Motherboard();
    RAM ram = new RAM();

    @Override
    public void turnOff() {
        super.turnOff();
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }
}
