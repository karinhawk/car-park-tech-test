package org.example;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class Space {

    RegularSpace regularSpace = new RegularSpace();
    CompactSpace compactSpace = new CompactSpace();

    Random random = new Random();

    public void constructSpaces(List<String> carParkSpaces){
        int a = random.nextInt(15);
        int b = random.nextInt(15);
        for (int i = 0; i < a; i++) {
            carParkSpaces.add("regularSpace");
        }
        for (int i = 0; i < b; i++){
            carParkSpaces.add("compactSpace");
        }
        System.out.println(carParkSpaces);
    }

    public int countSpaces(List<String> carParkSpaces){
        System.out.println(carParkSpaces.size());
        return carParkSpaces.size();
    }

}
