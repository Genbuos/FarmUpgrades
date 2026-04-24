package org.example.farm;

import org.example.animal.Chicken;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ChickenCoop {
    private ArrayList<Chicken> chickens;

    public ChickenCoop(ArrayList<Chicken> chickens){
        this.chickens = chickens;
    }
    public ChickenCoop(){
        chickens = new ArrayList<>();
    }

    public ArrayList<Chicken> getChickens() {
        return chickens;
    }
    public void addChicken(Chicken chicken){
        chickens.add(chicken);
    }

    @Override
    public String toString() {
        return "Chickens: " + getChickens().stream().map(Chicken::getAnimalName).collect(Collectors.joining(", "));

    }
}
