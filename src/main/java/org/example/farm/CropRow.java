package org.example.farm;

import org.example.crop.Crop;

import java.util.ArrayList;

public class CropRow {
    private ArrayList<Crop> crops = new ArrayList<>();

    public void fertilizeAllCrops(){
        for(Crop i : crops){
            i.setHasBeenHarvested(false);
            i.setHasBeenFerilized(true);
        }

        System.out.println("All crops have been fertilized!");
    }

    public void harvestAllCrops(){
        for(Crop i : crops){
            i.setHasBeenFerilized(false);
            i.setHasBeenHarvested(true);
        }

        System.out.println("All crops have been harvested!");
    }

    public void addCrop(Crop cropName){
        crops.add(cropName);
    }

    public ArrayList<Crop> getCrops() {
        return crops;
    }

    public void setCrops(ArrayList<Crop> crops) {
        this.crops = crops;
    }
}
