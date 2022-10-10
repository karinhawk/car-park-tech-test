package org.example;

public class Main {
    public static void main(String[] args) {
        CarPark carPark = new CarPark();
        Space space = new Space();
        RegularSpace regularSpace = new RegularSpace();
        CompactSpace compactSpace = new CompactSpace();
        System.out.println(carPark.getCarParkSpaces());
        regularSpace.constructCompactSpaces(carPark.getCarParkSpaces(), compactSpace);
        compactSpace.constructRegularSpaces(carPark.getCarParkSpaces(), regularSpace);
        space.countSpaces(carPark.getCarParkSpaces());
    }
}