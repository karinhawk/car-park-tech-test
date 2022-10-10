package org.example;

public class Main {
    public static void main(String[] args) {
        CarPark carPark = new CarPark();
        RegularSpace regularSpace = new RegularSpace();
        CompactSpace compactSpace = new CompactSpace();
        System.out.println(carPark.getCarParkSpaces());
        regularSpace.constructRegularSpaces(carPark.getCarParkSpaces(), regularSpace);
        compactSpace.constructCompactSpaces(carPark.getCarParkSpaces(), compactSpace);
        carPark.getNumberOfTotalSpaces();
    }
}