package org.example.farm;

import org.example.animal.Animal;
import org.example.animal.Horse;

import java.util.ArrayList;
import java.util.stream.Collectors;

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

    public ArrayList<Horse> getHorses(){
        return horses;
    }

    @Override
    public String toString() {
        return "Horses: " + getHorses().stream().map(Animal::getAnimalName).collect(Collectors.joining(", "));
    }
}
