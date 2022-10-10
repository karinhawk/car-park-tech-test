package org.example;

public class Van extends Vehicle {
    private int spaces = 6;

    public Van(int spaces) {
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
        return VehicleType.VAN;
    }
}
