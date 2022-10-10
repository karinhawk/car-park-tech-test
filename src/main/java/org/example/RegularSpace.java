package org.example;

import java.util.List;
import java.util.Random;

public class RegularSpace{


    Random random = new Random();
    private int holds = 2;

    public int getHolds() {
        return holds;
    }

    public void setHolds(int holds) {
        this.holds = holds;
    }

    public RegularSpace() {
        SpaceType regular = SpaceType.REGULAR;

    }

    public String toString(){

        return "regular space, holds 2";
    }

    public void constructRegularSpaces(List<SpaceType> carParkSpaces, RegularSpace regularSpace){
        int a = random.nextInt(15);
        for (int i = a; i > 0; i--) {
            carParkSpaces.add(SpaceType.REGULAR);
        }
        System.out.println(carParkSpaces);
    }

}
