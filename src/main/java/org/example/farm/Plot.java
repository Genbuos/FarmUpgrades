package org.example.farm;

import org.example.animal.Chicken;
import org.example.animal.Horse;
import org.example.crop.CornStalk;
import org.example.crop.TomatoStalk;
import org.example.person.Farmer;
import org.example.person.Pilot;
import org.example.vehicle.CropDuster;
import org.example.vehicle.Tractor;

public class Plot {

    public Plot() {
        // Initialize Field with 5 CropRows
        field.addCropRow(cropRow);
        field.addCropRow(cropRow2);
        field.addCropRow(cropRow3);
        field.addCropRow(cropRow4);
        field.addCropRow(cropRow5);

        // Initialize ChickenCoops with Chickens (15 chickens across 4 coops)
        ChickenCoop[] chickenCoops = new ChickenCoop[]{chickenCoop1, chickenCoop2, chickenCoop3, chickenCoop4};
        Chicken[] chickens = new Chicken[]{chicken1, chicken2, chicken3, chicken4, chicken5, chicken6,
                chicken7, chicken8, chicken9, chicken10, chicken11, chicken12, chicken13, chicken14, chicken15};
        int counter = 0;
        for (int j = 0; j < 15; j++) {
            if (j == 4) {
                counter++;
            }
            if (j == 8) {
                counter++;
            }
            if (j == 11) {
                counter++;
            }
            chickenCoops[counter].addChicken(chickens[j]);
        }

        // Initialize Stables with Horses (10 horses across 3 stables)
        Stable[] stables = new Stable[]{stable, stable2, stable3};
        Horse[] horses = new Horse[]{horse1, horse2, horse3, horse4,
                horse5, horse6, horse7, horse8, horse9, horse10};
        counter = 0;
        for (int j = 0; j < 10; j++) {
            if (j == 3) {
                counter++;
            }
            if (j == 6) {
                counter++;
            }
            if(j == 9) {
                stables[counter].addHorse(horse10);
                break;
            }
            stables[counter].addHorse(horses[j]);
        }

        // Add all stables and chicken coops to farm
        for (Stable stable : stables) {
            farm.addStable(stable);
        }
        for(ChickenCoop chickenCoop : chickenCoops) {
            farm.addChickenCoop(chickenCoop);
        }
    }

    // ===== Farm Components =====
    public Farm farm = new Farm();
    public FarmHouse farmHouse = new FarmHouse();
    public Field field = new Field();

    // ===== CropRows (5 total) =====
    public CropRow cropRow = new CropRow();
    public CropRow cropRow2 = new CropRow();
    public CropRow cropRow3 = new CropRow();
    public CropRow cropRow4 = new CropRow();
    public CropRow cropRow5 = new CropRow();

    // ===== Stables (3 total) =====
    public Stable stable = new Stable();
    public Stable stable2 = new Stable();
    public Stable stable3 = new Stable();

    // ===== ChickenCoops (4 total) =====
    public ChickenCoop chickenCoop1 = new ChickenCoop();
    public ChickenCoop chickenCoop2 = new ChickenCoop();
    public ChickenCoop chickenCoop3 = new ChickenCoop();
    public ChickenCoop chickenCoop4 = new ChickenCoop();

    // ===== People =====
    public Farmer farmer = new Farmer("Froilan", "Yehaw");
    public Pilot pilot = new Pilot("Froilanda", "Yehaw", 1);

    // ===== Vehicles =====
    public CropDuster cropDuster = new CropDuster(1, "brrrr");
    public Tractor tractor = new Tractor(2, "Cañañan");

    // ===== Crops =====
    public CornStalk cornStalk1 = new CornStalk();
    public CornStalk cornStalk2 = new CornStalk();
    public CornStalk cornStalk3 = new CornStalk();
    public CornStalk cornStalk4 = new CornStalk();
    public CornStalk cornStalk5 = new CornStalk();
    public TomatoStalk tomatoPlant1 = new TomatoStalk();
    public TomatoStalk tomatoPlant2 = new TomatoStalk();
    public TomatoStalk tomatoPlant3 = new TomatoStalk();
    public TomatoStalk tomatoPlant4 = new TomatoStalk();
    public TomatoStalk tomatoPlant5 = new TomatoStalk();

    // ===== Chickens (15 total) =====
    public Chicken chicken1 = new Chicken("Cluck");
    public Chicken chicken2 = new Chicken("Feathers");
    public Chicken chicken3 = new Chicken("Nugget");
    public Chicken chicken4 = new Chicken("Peep");
    public Chicken chicken5 = new Chicken("Drumstick");
    public Chicken chicken6 = new Chicken("Egbert");
    public Chicken chicken7 = new Chicken("Bawk-Bawk");
    public Chicken chicken8 = new Chicken("Sunny");
    public Chicken chicken9 = new Chicken("Rosie");
    public Chicken chicken10 = new Chicken("Cinnamon");
    public Chicken chicken11 = new Chicken("Penny");
    public Chicken chicken12 = new Chicken("Quincy");
    public Chicken chicken13 = new Chicken("Rocky");
    public Chicken chicken14 = new Chicken("Sunny");
    public Chicken chicken15 = new Chicken("Tilly");

    // ===== Horses (10 total) =====
    public Horse horse1 = new Horse("Shadow");
    public Horse horse2 = new Horse("Thunder");
    public Horse horse3 = new Horse("Spirit");
    public Horse horse4 = new Horse("Midnight");
    public Horse horse5 = new Horse("Duchess");
    public Horse horse6 = new Horse("Romeo");
    public Horse horse7 = new Horse("Luna");
    public Horse horse8 = new Horse("Max");
    public Horse horse9 = new Horse("Sapphire");
    public Horse horse10 = new Horse("Apollo");
}