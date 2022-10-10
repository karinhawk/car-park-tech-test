package org.example;

public class Car extends Vehicle {

    private int spaces = 2;

    public Car(int spaces) {
        super(spaces);
    }

    @Override
    public int getSpaces() {
        return spaces;
    }

    public void setSpaces(int spaces) {
        this.spaces = spaces;
    }

    @Override
    public VehicleType getType() {
        return VehicleType.CAR;
    }
}
