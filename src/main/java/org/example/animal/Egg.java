package org.example.animal;

import org.example.interfaces.Edible;

public class Egg implements Edible {

    private final boolean isEdible = true;

    @Override
    public boolean getIfEdible() {
        return isEdible;
    }
}
