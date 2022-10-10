package org.example;

import java.util.List;

public class CompactSpace extends Space {

    SpaceType compact = SpaceType.COMPACT;

    public CompactSpace() {
    }

    @Override
    public void constructCompactSpaces(List<Space> carParkSpaces, CompactSpace compactSpace){
        int a = random.nextInt(15);
        for (int i = a; i > 0; i--) {
            carParkSpaces.add(compactSpace);
        }
        System.out.println(carParkSpaces);
    }
}
