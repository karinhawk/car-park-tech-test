package org.example;

import java.util.List;

public class RegularSpace extends Space {


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

    @Override
    public void constructRegularSpaces(List<Space> carParkSpaces, RegularSpace regularSpace){
        int a = random.nextInt(15);
        for (int i = a; i > 0; i--) {
            carParkSpaces.add(regularSpace);
        }
        System.out.println(carParkSpaces);
    }
}
