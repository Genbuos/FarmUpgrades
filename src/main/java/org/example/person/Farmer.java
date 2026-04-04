package org.example.person;

import org.example.animal.Horse;
import org.example.crop.Crop;
import org.example.farm.CropRow;
import org.example.interfaces.*;
import org.example.vehicle.Tractor;

public class Farmer extends Person implements Botanist, Rider {
    public Farmer(String name, String quip) {
        super(name, quip);
    }


    @Override
    public void makeNoise() {
        System.out.println("Howdy, my name is" + this.getName());
    }


    @Override
    public void plant(Crop crop, CropRow cropRow) {
        cropRow.addCrop(crop);
    }

    @Override
    public void mount(Rideable object) {
        if (object instanceof FarmVehicle){
            if(object instanceof Tractor){
                if(!object.isInUse()){
                    object.setInUse(true);
                    System.out.println("Tractor Mounted!");
                } else {
                    System.out.println("Tractor is in use and cannot be mounted!");
                }
            } else if (object instanceof Horse){
                if(!object.isInUse()){
                    object.setInUse(true);
                    System.out.println("Horse is Mounted!");
                } else {
                    System.out.println("The horse is in use and cannot be mounted!");
                }
            }
        }
    }

    @Override
    public void dismount(Rideable object) {
        if (object instanceof FarmVehicle){
            if(object instanceof Tractor){
                if(object.isInUse() ){
                    object.setInUse(false);
                    System.out.println("Farmer has dismounted Tractor!");
                } else {
                    System.out.println("Tractor is not in use and can be mounted!");
                }
            } else if (object instanceof Horse){
                if(object.isInUse()){
                    object.setInUse(false);
                    System.out.println("Horse is dismounted!");
                } else {
                    System.out.println("The horse is not in use and can be mounted!");
                }
            }
        }
    }
}
