package org.example.animal;

import org.example.crop.Corn;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class HorseTest {
    private Horse horse;
    private Corn corn;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();


    @BeforeEach
    void setUp() {
        horse = new Horse("Spirit");
        corn = new Corn();
        System.setOut(new PrintStream(outputStreamCaptor));

    }


    @Test
    void getAnimalName() {
        assertEquals("Spirit", horse.getAnimalName());
    }

    @Test
    void setAnimalName() {
        horse.setAnimalName("mustang");
        var expected = "mustang";
        assertEquals(expected, horse.getAnimalName());
    }

    @Test
    void eatAndGetStomach() {
        horse.eat(corn);
        assertEquals(1, horse.getStomach());
    }

    @Test
    void makeNoise() {
        horse.makeNoise();

        assertEquals("Spirit says neigh!", outputStreamCaptor.toString().trim());
    }


    @Test
    void isInUse() {
        assertFalse(horse.isInUse());
    }

    @Test
    void setInUse() {
        horse.setInUse(true);
            assertTrue(horse.isInUse());
    }
}