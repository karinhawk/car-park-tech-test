package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarPark {
        List<String> carParkSpaces = new ArrayList<>();

        public List<String> getCarParkSpaces() {
                return carParkSpaces;
        }

        public void setCarParkSpaces(List<String> carParkSpaces) {
                this.carParkSpaces = carParkSpaces;
        }

        public void getRemainingSpaces(){

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
