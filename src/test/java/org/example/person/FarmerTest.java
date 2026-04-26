package org.example.person;

import org.example.animal.Horse;
import org.example.crop.CornStalk;
import org.example.crop.Tomato;
import org.example.crop.TomatoStalk;
import org.example.farm.CropRow;
import org.example.vehicle.Tractor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class FarmerTest {
    private Farmer farmer;

    private Tractor tractor;
    private Horse horse;

    private Tomato tomato;
    private TomatoStalk tomatoStalk;
    private CornStalk cornStalk;

    private CropRow cropRow;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();


    @BeforeEach
    void setUp() {
        farmer = new Farmer("Jordan", "Fo-sho!");
        tomato = new Tomato();
        tomatoStalk = new TomatoStalk();
        cornStalk = new CornStalk();
        cropRow = new CropRow();
        tractor = new Tractor(1,"tractoring...");
        horse = new Horse("Spirit");
        System.setOut(new PrintStream(outputStreamCaptor));

    }

    @Test
    void getName() {
        var expected = "Jordan";

        assertEquals(expected, farmer.getName());
    }

    @Test
    void setName() {
        farmer.setName("Jimii");

        assertNotEquals("Jordan", farmer.getName());
        assertEquals("Jimii", farmer.getName());


    }

    @Test
    void getQuip() {
        var expected = "Fo-sho!";
        assertEquals(expected, farmer.getQuip());
    }

    @Test
    void setQuip() {
        farmer.setQuip("oh yeah!");
        var expected = "oh yeah!";
        assertEquals(expected, farmer.getQuip());
    }

    @Test
    void eatAndGetStomach() {
        farmer.eat(tomato);

        assertEquals(1, farmer.getStomach());
    }


    @Test
    void makeNoise() {
        farmer.makeNoise();
        assertEquals("Howdy, my name is Jordan", outputStreamCaptor.toString().trim());
    }

    @Test
    void plant() {
        farmer.plant(cornStalk, cropRow);
        farmer.plant(tomatoStalk, cropRow);

        assertEquals(2, cropRow.getCrops().size());

    }

    @Test
    void mount() {
        farmer.mount(tractor);

        assertEquals("Tractor Mounted!", outputStreamCaptor.toString().trim());

        farmer.dismount(tractor);

        outputStreamCaptor.reset();


        farmer.mount(horse);

        assertEquals("Horse is Mounted!", outputStreamCaptor.toString().trim());
    }

    @Test
    void dismount() {
        farmer.mount(horse);
        outputStreamCaptor.reset();
        farmer.dismount(horse);

        assertEquals("Horse is dismounted!", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();

        farmer.mount(tractor);
        outputStreamCaptor.reset();
        farmer.dismount(tractor);

        assertEquals("Farmer has dismounted Tractor!", outputStreamCaptor.toString().trim());

    }
}