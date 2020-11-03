package com.company;

public class Boat extends Float {

    public Boat() {

        MessageCenter.DebugMessage("Creating a Boat");
    }

    @Override
    public String toString() {

        return String.format("boat");
    }

    @Override
    public void Move(int speed, String direction) {
        MessageCenter.DebugMessage(String.format("I am rowing %s at %d metres per hour", direction, speed));
    }
}
