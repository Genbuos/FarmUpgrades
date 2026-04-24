package org.example.farm;

import org.example.person.Farmer;
import org.example.person.Pilot;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class FarmHouseTest {
    private FarmHouse farmHouse;
    private Farmer farmer;
    private Farmer farmer2;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();



    @BeforeEach
    void setUp() {
        farmHouse = new FarmHouse();
        farmer = new Farmer("Froilan", "Fosho!");
        farmer2 = new Farmer("Froilinda", "Mos def!");
        System.setOut(new PrintStream(outputStreamCaptor));


    }


    @Test
    void getAndAddFarmHands() {
        farmHouse.addFarmHand(farmer);
        farmHouse.addFarmHand(farmer2);
        var expected = 2;

        assertEquals(expected, farmHouse.getFarmHands().size());

    }


    @Test
    void testToString() {
        farmHouse.addFarmHand(farmer);
        farmHouse.addFarmHand(farmer2);
        var expected = "Farmhouse workers: Froilan, Froilinda";

        assertEquals(expected, farmHouse.toString());
    }
}