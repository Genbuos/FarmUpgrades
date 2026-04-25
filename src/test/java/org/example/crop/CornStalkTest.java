package org.example.crop;

import org.example.interfaces.Edible;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CornStalkTest {
    private CornStalk cornStalk;
    private Corn corn;


    @BeforeEach
    void setUp() {
        cornStalk = new CornStalk();
        corn = new Corn();
    }


    @Test
    void isHasBeenHarvested() {
        assertFalse(cornStalk.isHasBeenHarvested());
    }

    @Test
    void setHasBeenHarvested() {
        cornStalk.setHasBeenHarvested(true);

        assertTrue(cornStalk.isHasBeenHarvested());
    }

    @Test
    void isHasBeenFertilized() {
        assertFalse(cornStalk.isHasBeenFertilized());
    }

    @Test
    void setHasBeenFertilized() {
        cornStalk.setHasBeenFertilized(true);

        assertTrue(cornStalk.isHasBeenFertilized());
    }

    @Test
    void yield() {
        cornStalk.setHasBeenFertilized(true);

        assertInstanceOf(Corn.class, cornStalk.yield());

    }
}