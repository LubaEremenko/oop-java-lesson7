package com.company;

public class Car extends Vehicle {

    public Car() {
                MessageCenter.DebugMessage("Creating a Car");
                setManufacturer("Unknown manufacturer");
                setModelName("Unknown model");
    }

    public Car(String manufacturer, String modelName) {
        MessageCenter.DebugMessage("Creating a Car with manufacturer and model name");

        setManufacturer(manufacturer);
        setModelName(modelName);


    }
    @Override
    public String toString() {
        return  String.format("ToString() => C2 manufacturer: %s, model %s", getManufacturer(), getModelName());

    }

    @Override
    public void Move(int speed, String direction) {


    }

}
