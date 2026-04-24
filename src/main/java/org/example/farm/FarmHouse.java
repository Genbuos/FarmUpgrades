package org.example.farm;

import org.example.person.Person;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class FarmHouse {
    private ArrayList<Person> farmHands;

    public FarmHouse(ArrayList<Person> farmHands) {
        this.farmHands = farmHands;
    }

    public FarmHouse(){
        farmHands = new ArrayList<>();
    }

    public ArrayList<Person> getFarmHands() {
        return farmHands;
    }

    public void addFarmHand(Person person){
        farmHands.add(person);
    }

    @Override
    public String toString() {
        return "Farmhouse workers: " + getFarmHands().stream().map(Person::getName).collect(Collectors.joining(", "));

    }
}
