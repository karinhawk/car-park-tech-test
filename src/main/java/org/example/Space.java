package org.example;

import java.util.Map;
import java.util.Random;

public class Space {

    RegularSpace regularSpace = new RegularSpace();
    CompactSpace compactSpace = new CompactSpace();

    Random random = new Random();

    public void constructSpaces(Map<String, Integer> carParkSpaces){
        int a = random.nextInt(15);
        int b = random.nextInt(15);
        for (int i = 0; i < a; i++) {
            carParkSpaces.put("regularSpace", 2);
        }
        for (int i = 0; i < b; i++){
            carParkSpaces.put("compactSpace", 1);
        }
        System.out.println(carParkSpaces);
    }

    public int countSpaces(Map<String, Integer> carParkSpaces){
        System.out.println(carParkSpaces.size());
        return carParkSpaces.size();
    }

}
