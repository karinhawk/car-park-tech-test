package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarPark {
       private List<Space> carParkSpaces = new ArrayList<>();

        public List<Space> getCarParkSpaces() {
                return carParkSpaces;
        }

        public void setCarParkSpaces(List<Space> carParkSpaces) {
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
