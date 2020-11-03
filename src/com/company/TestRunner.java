package com.company;

public class TestRunner {

    public void Run() {
        RunObjects();
        RunCarPark();

    }
    public void RunCarPark() {
        CarPark carpark = new CarPark();
        Car c1 = new Car();
        Car c2 = new Car("Lada", "Kalina");
        Car c3 = new Car("Ford", "Focus");

        carpark.ParkVehicle(c1);
        carpark.ParkVehicle(c2);
        carpark.ParkVehicle(c3);

        Bicycle b2 = new Bicycle();
        carpark.ParkVehicle(b2);

        MessageCenter.DebugMessage(carpark.toString());

    }

    public  void  RunObjects () {
       // Vehicle v1 = new Vehicle();// abstract cannot be instaniated
       // Cycle c = new Cycle();
        Car c1 = new Car();
        Car c2 = new Car("Nissan", "Navara");
        MessageCenter.DebugMessage(String.format("C2 maufacturer: %s , model %s", c2.getManufacturer(), c2.getModelName()));
        MessageCenter.DebugMessage(c2.toString());

        Bicycle b1 = new Bicycle();
        System.out.println(b1.toString());

        MotoCycle m1 = new MotoCycle();

        Boat bt = new Boat();
        bt.Move(5, "West");

        Plane pl1 = new Plane();
        pl1.Move(350, "North");

        }
}
