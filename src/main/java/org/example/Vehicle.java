package org.example;

public class Vehicle {

    public Vehicle(int spaces) {
    }

    public VehicleType getType(){
        return null;
    }

    public int getSpaces(){
        return -1;
    }

    public void describe(VehicleType type, int spaces){
        System.out.println("this " + type + " takes up " + spaces + " spaces.");
    }
}
