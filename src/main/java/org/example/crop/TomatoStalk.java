package org.example.crop;

import org.example.interfaces.Edible;

public class TomatoStalk extends Crop{

    public TomatoStalk(){
        super(false, false);
    }

    @Override
    public Edible yield() {
        if(!isHasBeenFertilized()){
            System.out.println("Tomato plant cannot be harvested ( Has not been fertlized!)");
            return null;
        }

        if(isHasBeenHarvested()){
            System.out.println("Tomato plant cannot be harvested (Has already been harvested!)");
            return null;
        }

        System.out.println("Tomato plant has been harvested!");
        setHasBeenFertilized(false);
        setHasBeenHarvested(true);
        return new Tomato();
    }
}
