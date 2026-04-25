package org.example.vehicle;

import org.example.interfaces.NoiseMaker;
import org.example.interfaces.Rideable;

public abstract class Vehicle implements Rideable, NoiseMaker {
    private boolean inUse = false;

    private int id;
    private String sound;

    public Vehicle(int id, String sound) {
        this.id = id;
        this.sound = sound;
    }

    public Vehicle() {
    }

    @Override
    public boolean isInUse() {
        return inUse;
    }

    @Override
    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public void makeNoise() {
        System.out.println(getSound());
    }
}
