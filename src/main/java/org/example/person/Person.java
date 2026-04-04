package org.example.person;

import org.example.interfaces.Eater;
import org.example.interfaces.Edible;
import org.example.interfaces.NoiseMaker;
import org.example.interfaces.Stomach;

import java.util.ArrayList;

public abstract class Person implements NoiseMaker, Eater, Stomach {
    private String name;
    private String quip;

    protected ArrayList<Edible> stomach = new ArrayList<>();

    public Person(String name, String quip) {
        this.name = name;
        this.quip = quip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuip() {
        return quip;
    }

    public void setQuip(String quip) {
        this.quip = quip;
    }

    @Override
    public void eat(Edible food) {
        System.out.println(name + " is eating " + food.getClass().getSimpleName().toLowerCase());

        stomach.add(food);
    }


    @Override
    public int getStomach() {
        return stomach.size();
    }
}
