package org.example.animal;

import org.example.interfaces.Edible;
import org.example.interfaces.Produce;

public class Chicken extends Animal implements Produce {
    private boolean hasBeenFertilized = false;

    public Chicken(String animalName) {
        super(animalName);
    }

    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    @Override
    public Edible yield() {
        if(hasBeenFertilized){
            System.out.println(getAnimalName() + " has laid an egg!");
            hasBeenFertilized = false;
            return new Egg();
        } else {
            System.out.println(getAnimalName() + " cannot lay an egg! ");
            return null;
        }
    }

    @Override
    public void makeNoise() {
        System.out.println(getAnimalName() + " says Cluck!");
    }
}
