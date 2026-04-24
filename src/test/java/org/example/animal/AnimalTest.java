package org.example.animal;

import org.example.crop.Corn;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    private Chicken chicken;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private Corn corn;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        chicken = new Chicken("little");
        corn = new Corn();

    }

    @Test
    void getAnimalName() {
        assertEquals("little", chicken.getAnimalName());
    }

    @Test
    void setAnimalName() {
        var namechange = "lil chicken";
        chicken.setAnimalName(namechange);
        assertEquals(namechange, chicken.getAnimalName());
    }

    @Test
    void eatAndGetStomach() {
        chicken.eat(corn);
        assertEquals(1, chicken.getStomach());
    }

    @Test
    void makeNoise() {
        chicken.makeNoise();

        assertEquals("little says Cluck!", outputStreamCaptor.toString().trim());
    }


}