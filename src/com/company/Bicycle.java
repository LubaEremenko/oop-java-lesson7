package com.company;

public class Bicycle extends Cycle{

    public Bicycle () {
        MessageCenter.DebugMessage("Creating a Bicycle");

    }



    @Override
    public String toString() {
        return "I am a bicycle";
    }

    @Override
    public void Move(int speed, String direction){

    }


}
