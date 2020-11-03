package com.company;

public class Plane extends Vehicle {

    public Plane() {
        MessageCenter.DebugMessage("Creating a plane");

    }

    @Override
    public String toString() {
        return String.format("plane");


    }

    @Override
    public void Move(int speed, String direction) {
        MessageCenter.DebugMessage(String.format("I am flying %s at %d knot per hour", direction, speed));

    }
}
