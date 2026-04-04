package org.example.crop;

import org.example.interfaces.Edible;

public class Tomato implements Edible {
    @Override
    public boolean getIfEdible() {
        return true;
    }
}
