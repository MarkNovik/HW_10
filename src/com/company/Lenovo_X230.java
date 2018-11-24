package com.company;

public class Lenovo_X230 extends Laptop {
    Processor coreI5 = new Processor(2500, "Intel");
    RAM DDR3 = new RAM(1600);
    Display display = new Display(1366, 768, "TN");
    Battery battery = new Battery(65);

    @Override
    public void turnOff() {
        super.turnOff();
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }


}
