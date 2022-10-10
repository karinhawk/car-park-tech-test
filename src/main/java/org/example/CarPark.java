package org.example;

import java.util.ArrayList;

import java.util.List;
import java.util.Random;


import static org.example.SpaceType.COMPACT;
import static org.example.SpaceType.REGULAR;
import static org.example.VehicleType.*;

public class CarPark {
       private List<SpaceType> carParkSpaces = new ArrayList<>();

       private List<Vehicle> vehicleList = new ArrayList<>();


       Random random = new Random();

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public List<SpaceType> getCarParkSpaces() {
                return carParkSpaces;
        }

        public void setCarParkSpaces(List<SpaceType> carParkSpaces) {
                this.carParkSpaces = carParkSpaces;
        }

        public void getNumberOfTotalSpaces(){
            System.out.println(carParkSpaces.size());
        }

    VehicleFactory factory = new VehicleFactory();

        public void createTheVehicles(){
            int a = random.nextInt(5);

            for (int i = a; i > 0; i--) {
                vehicleList.add(factory.createVehicle(VAN));
                vehicleList.add(factory.createVehicle(CAR));
                vehicleList.add(factory.createVehicle(MOTORBIKE));
            }
        }

        public void listVehicles(){
            for ( Vehicle vehicle: vehicleList) {
                vehicle.describe(vehicle.getType(), vehicle.getSpaces());
            }
        }
//        public void populateCarPark(SpaceType spaceType){
//            //remove active space from carpark
//            //add
//            int a = carParkSpaces.size();
//            for (int i = a; i > 0; i--) {
//                if (spaceType == REGULAR){
//                    factory.createVehicle(CAR);
//                    carParkSpaces.remove(REGULAR);
//                } else if (spaceType == COMPACT){
//                    factory.createVehicle(MOTORBIKE);
//                    carParkSpaces.remove(COMPACT);
//                }
//            }
//        }

        public void getRemainingSpaces(){
            System.out.println(carParkSpaces.size());
        }

        public void announceCarParkFull(){

        }
        public void announceCarParkEmpty(){

        }
        public void allCompactTaken(){

        }
        public void allRegularTaken(){

        }
        public int calculateVanSpots(){
                return 1;
        }
}
