package org.example;

public class Motorbike extends Vehicle {

    private int spaces = 1;

    public Motorbike(int spaces) {
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
        return VehicleType.MOTORBIKE;
    }
}
