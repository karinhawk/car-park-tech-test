package org.example;

import java.util.HashMap;
import java.util.Map;

public class CarPark {
        Map<String, Integer> carParkSpaces = new HashMap<>();

        public Map<String, Integer> getCarParkSpaces() {
                return carParkSpaces;
        }

        public void setCarParkSpaces(Map<String, Integer> carParkSpaces) {
                this.carParkSpaces = carParkSpaces;
        }
}
