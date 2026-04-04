package org.example.farm;

import org.example.animal.Horse;

import java.util.ArrayList;

public class Stable {

    private ArrayList<Horse> horses = new ArrayList<>();

    public Stable(ArrayList<Horse> horses) {
        this.horses = horses;
    }

    public Stable(){
        horses = new ArrayList<>();
    }

    public void addHorse(Horse horse){
        horses.add(horse);
    }

    @Override
    public String toString() {
        return "Stable{" +
                "horses=" + horses +
                '}';
    }
}
