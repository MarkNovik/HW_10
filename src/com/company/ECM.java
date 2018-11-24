package com.company;

public class ECM implements Turnable {
    boolean isTurnedOn = false;

    @Override
    public void turnOn() {
        isTurnedOn = true;
    }

    @Override
    public void turnOff() {
        isTurnedOn = false;
    }

    public Value calculateSomething(Value value) {
        //Calculating...(peep,peep!)
        return value;
    }
}
