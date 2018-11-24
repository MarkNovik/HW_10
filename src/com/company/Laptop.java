package com.company;

public class Laptop extends Computer{
    Processor processor = new Processor(3000, "Company");
    Motherboard motherboard = new Motherboard();
    Display display = new Display(1920, 1080, "LCD");

    @Override
    public void turnOff() {
        super.turnOff();
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }
}
