package com.company;

public class Communicator extends ECM{
    Battery battery = new Battery(1000);
    Display display = new Display(640,480, "TFT");

    @Override
    public void turnOff() {
        super.turnOff();
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }
}
