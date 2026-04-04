package org.example.animal;

import org.example.interfaces.Eater;
import org.example.interfaces.Edible;
import org.example.interfaces.NoiseMaker;
import org.example.interfaces.Stomach;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal implements NoiseMaker, Stomach, Eater {
    private String animalName;
    protected List<Edible> stomach = new ArrayList<>();

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    @Override
    public void eat(Edible food) {
        System.out.println(animalName + " is eating " + food.getClass().getSimpleName().toLowerCase());
        stomach.add(food);
    }

    @Override
    public void makeNoise() {
        System.out.println(getAnimalName() + " make's a noise!");
    }

    @Override
    public int getStomach() {
        return stomach.size();
    }
}
