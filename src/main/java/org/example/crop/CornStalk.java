package org.example.crop;

import org.example.interfaces.Edible;

public class CornStalk extends Crop{
    public CornStalk(){
        super(false, false);
    }

    @Override
    public Edible yield() {
     if(!isHasBeenFertilized()){
         System.out.println("Cornstalk cannot be harvested (Has not been fertilized !)");
         return null;
     }

     if (isHasBeenHarvested()){
         System.out.println("Cornstalk cannot be harvested (Already Harvested!)");
         return null;
     }

     System.out.println("Cornstalk has been harvested!");
     setHasBeenFertilized(false);
     setHasBeenHarvested(true);
     return new Corn();
    }
}
