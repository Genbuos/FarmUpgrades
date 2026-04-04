package org.example.crop;

import org.example.interfaces.Edible;

public class Corn implements Edible {
    @Override
    public boolean getIfEdible() {
        return true;
    }
}
