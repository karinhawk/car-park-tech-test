package org.example;

public class VehicleFactory {

    Motorbike motorbike = new Motorbike(1);
    Car car = new Car(2);
    Van van = new Van(6);

    public Vehicle createVehicle(VehicleType type) {
        switch (type) {
            case VAN:
                return new Van(van.getSpaces());
            case CAR:
                return new Car(car.getSpaces());
            case MOTORBIKE:
                return new Motorbike(motorbike.getSpaces());
            default:
                throw new IllegalArgumentException("no");
        }
    }
}
