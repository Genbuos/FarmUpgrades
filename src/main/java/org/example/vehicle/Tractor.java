package org.example.vehicle;

import org.example.farm.CropRow;
import org.example.farm.Field;
import org.example.interfaces.FarmVehicle;

import java.util.ArrayList;

public class Tractor extends Vehicle implements FarmVehicle {
    public Tractor(int id, String sound) {
        super(id, sound);
    }

    public void harvest(Field field){
        if(!isInUse()){
            System.out.println(" Tractor is not in use!");
            return;
        }
        System.out.println("Tractor is being operated!");


        for (CropRow cropRow: field.getCropRows()){
            cropRow.harvestAllCrops();
        }
        System.out.println("Field harvested!");
    }

    @Override
    public void operate(boolean inUse) {
        setInUse(inUse);
    }
}
