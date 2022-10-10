package org.example;

import java.util.List;
import java.util.Random;

public class CompactSpace {

    Random random = new Random();


    SpaceType compact = SpaceType.COMPACT;

    public CompactSpace() {
    }

    public void constructCompactSpaces(List<SpaceType> carParkSpaces, CompactSpace compactSpace){
        int a = random.nextInt(15);
        for (int i = a; i > 0; i--) {
            carParkSpaces.add(SpaceType.COMPACT);
        }
        System.out.println(carParkSpaces);
    }
}
