package org.example.vehicle;

import org.example.farm.CropRow;
import org.example.farm.Field;
import org.example.interfaces.FarmVehicle;

import java.util.ArrayList;

public class CropDuster extends Aircraft implements FarmVehicle {
    public CropDuster(int id, String sound) {
        super(id, sound);
    }
    private void fertilize(Field field){
        ArrayList<CropRow> cropRows = field.getCropRows();
        for (CropRow cropRow: cropRows) {
            cropRow.fertilizeAllCrops();
        }
    }

    @Override
    public void operate(boolean inUse) {
        setInUse(inUse);
    }

    @Override
    public void fly(Field field) {
        if(!isInUse()){
            System.out.println("Crop duster cannot be fly because no one is operating it! ");
        }
        System.out.println("Crop duster is being operated!");
        fertilize(field);
        System.out.println("Field fertilized!");
    }
}
