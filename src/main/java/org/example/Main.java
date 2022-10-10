package org.example;

public class Main {
    public static void main(String[] args) {
        Space space = new Space();
        CarPark carPark = new CarPark();
        space.constructSpaces(carPark.getCarParkSpaces());
        space.countSpaces(carPark.getCarParkSpaces());
    }
}