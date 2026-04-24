package org.example.farm;

import org.example.animal.Chicken;
import org.example.animal.Horse;
import org.example.person.Farmer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FarmTest {
    private Farm farm;
    private FarmHouse farmHouse;

    private Stable stable;
    private Stable stable2;
    private Stable stable3;

    private ChickenCoop chickenCoop;
    private ChickenCoop chickenCoop2;

    private Chicken chicken;
    private Chicken chicken2;
    private Chicken chicken3;
    private Chicken chicken4;
    private Chicken chicken5;
    private Chicken chicken6;

    private Horse horse;
    private Horse horse2;
    private Horse horse3;

    private Farmer farmer;
    private Farmer farmer2;
    private Farmer farmer3;
    private Farmer farmer4;

    @BeforeEach
    void setUp() {
        farm = new Farm();
        farmHouse = new FarmHouse();

        stable = new Stable();
        stable2 = new Stable();
        stable3 = new Stable();

        chickenCoop = new ChickenCoop();
        chickenCoop2 = new ChickenCoop();

        horse = new Horse("Spirit");
        horse2 = new Horse("Seabiscut");
        horse3 = new Horse("Mustang");

        chicken = new Chicken("Little");
        chicken2 = new Chicken("Popeyes");
        chicken3 = new Chicken("Donald");
        chicken4 = new Chicken("KFC");
        chicken5 = new Chicken("Jolibee");
        chicken6 = new Chicken("Fry N Pie");

        farmer = new Farmer("Jordan", "C'mon bro!");
        farmer2 = new Farmer("Ivan", "6-7!");
        farmer3 = new Farmer("Micky", "HUH HA!");
        farmer4 = new Farmer("Donald", "*Laughs in duck*");
    }


    @Test
    void getAndAddStables() {
        farm.addStable(stable);
        farm.addStable(stable2);
        farm.addStable(stable3);

        var expected = 3;

        assertEquals(expected, farm.getStables().size());
    }



    @Test
    void getAndAddChickenCoops() {
        chickenCoop.addChicken(chicken);
        chickenCoop.addChicken(chicken2);
        chickenCoop.addChicken(chicken3);

        chickenCoop2.addChicken(chicken4);
        chickenCoop2.addChicken(chicken5);
        chickenCoop2.addChicken(chicken6);

        farm.addChickenCoop(chickenCoop);
        farm.addChickenCoop(chickenCoop2);

        var expected = 2;

        assertEquals(expected, farm.getChickenCoops().size());

    }


    @Test
    void getFarmHouse() {
        var expected = "Farmhouse workers: Jordan, Ivan";
        farm.getFarmHouse().addFarmHand(farmer);
        farm.getFarmHouse().addFarmHand(farmer2);

        assertEquals(expected, farm.getFarmHouse().toString());
    }

    @Test
    void setFarmHouse() {
        farmHouse.addFarmHand(farmer3);
        farmHouse.addFarmHand(farmer4);
        farm.setFarmHouse(farmHouse);

        var expected = "Farmhouse workers: Micky, Donald";

        assertEquals(expected, farm.getFarmHouse().toString());
    }

    @Test
    void testToString() {
        farmHouse.addFarmHand(farmer3);
        farmHouse.addFarmHand(farmer4);

        farm.setFarmHouse(farmHouse);
        farm.addStable(stable);
        farm.addStable(stable2);
        farm.addStable(stable3);
        farm.addChickenCoop(chickenCoop);
        farm.addChickenCoop(chickenCoop2);
        var expected = "Farm: Stables=3, Chicken-coops=2, Farmhouse workers: Micky, Donald";

        assertEquals(expected, farm.toString());
    }
}