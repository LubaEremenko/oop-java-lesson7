package com.company;

public class MotoCycle extends Cycle {

    public MotoCycle() {
        MessageCenter.DebugMessage("Creating a MotorCycle");
    }



    @Override
    public String toString() {
        return String.format("motorcycle");
    }

    @Override
    public void Move(int speed, String direction){

    }

}
