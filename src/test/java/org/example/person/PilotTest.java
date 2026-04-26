package org.example.person;

import org.example.animal.Egg;
import org.example.animal.Horse;
import org.example.crop.Corn;
import org.example.farm.Field;
import org.example.vehicle.CropDuster;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PilotTest {
    private Pilot pilot;
    private CropDuster cropDuster;
    private Corn corn;
    private Field field;
    private Horse horse;
    private Egg egg;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        pilot = new Pilot("Jordan", "I'm too fly", 1L);
        cropDuster = new CropDuster(1, "flying around...");
        corn = new Corn();
        horse = new Horse("Spirit");
        egg = new Egg();
        System.setOut(new PrintStream(outputStreamCaptor));

    }

    @Test
    void getName() {
        var expected = "Jordan";

        assertEquals(expected, pilot.getName());

    }

    @Test
    void setName() {
        var expected = "Jordy";

        assertNotEquals(expected, pilot.getName());

        pilot.setName(expected);

        assertEquals(expected, pilot.getName());
    }

    @Test
    void getQuip() {
        var expected = "I'm too fly";

        assertEquals(expected, pilot.getQuip());
    }

    @Test
    void setQuip() {
        var expected = "Taking off...";

        assertNotEquals(expected, pilot.getQuip());

        pilot.setQuip(expected);

        assertEquals(expected, pilot.getQuip());
    }

    @Test
    void eatAndGetStomach() {
        pilot.eat(corn);
        pilot.eat(egg);

        assertEquals(2, pilot.getStomach());
    }



    @Test
    void getLicenseID() {
        assertEquals(1L, pilot.getLicenseID());
    }

    @Test
    void setLicenseID() {
        var expected = 2L;

        assertNotEquals(expected, pilot.getLicenseID());

        pilot.setLicenseID(expected);

        assertEquals(expected, pilot.getLicenseID());
    }

    @Test
    void isRiding() {
        assertFalse(pilot.isRiding());
    }

    @Test
    void setRiding() {
        assertFalse(pilot.isRiding());

         pilot.setRiding(true);

        assertTrue(pilot.isRiding());

    }

    @Test
    void makeNoise() {
        pilot.makeNoise();
        assertEquals("Let's take the skies... This is your pilot Jordan", outputStreamCaptor.toString().trim());
    }

    @Test
    void mount() {
        pilot.mount(cropDuster);

        assertEquals("Pilot has boarded Cropduster", outputStreamCaptor.toString().trim());

        pilot.dismount(cropDuster);

        outputStreamCaptor.reset();


        pilot.mount(horse);

        assertEquals("Horse is Mounted!", outputStreamCaptor.toString().trim());
    }

    @Test
    void dismount() {
        pilot.mount(horse);
        outputStreamCaptor.reset();
        pilot.dismount(horse);

        assertEquals("Horse is dismounted!", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();

        pilot.mount(cropDuster);
        outputStreamCaptor.reset();
        pilot.dismount(cropDuster);

        assertEquals("Pilot has dismounted Cropduster", outputStreamCaptor.toString().trim());


    }
}