package org.example.animal;

import org.example.crop.Corn;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
class ChickenTest {

    private Chicken chicken;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private Corn corn;
    private Egg egg;

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

    @Test
    void isHasBeenFertilized() {
        assertFalse(chicken.isHasBeenFertilized());
    }

    @Test
    void setHasBeenFertilized() {
        chicken.setHasBeenFertilized(true);
        assertTrue(chicken.isHasBeenFertilized());
    }

    @Test
    void yield() {
        chicken.setHasBeenFertilized(true);
        var actual = chicken.yield();
       assertInstanceOf(Egg.class, actual);
    }

}