package org.example.vehicle;

import org.example.farm.Field;

public abstract class Aircraft extends Vehicle {
    public Aircraft(int id, String sound) {
        super(id, sound);
    }

    public abstract void fly(Field field);
}
