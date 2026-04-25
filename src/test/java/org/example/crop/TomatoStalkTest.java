package org.example.crop;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TomatoStalkTest {
    private TomatoStalk tomatoStalk;


    @BeforeEach
    void setUp() {
        tomatoStalk = new TomatoStalk();
    }


    @Test
    void isHasBeenHarvested() {
        assertFalse(tomatoStalk.isHasBeenHarvested());
    }

    @Test
    void setHasBeenHarvested() {
        tomatoStalk.setHasBeenHarvested(true);

        assertTrue(tomatoStalk.isHasBeenHarvested());
    }

    @Test
    void isHasBeenFertilized() {
        assertFalse(tomatoStalk.isHasBeenFertilized());
    }

    @Test
    void setHasBeenFertilized() {
        tomatoStalk.setHasBeenFertilized(true);

        assertTrue(tomatoStalk.isHasBeenFertilized());

    }

    @Test
    void yield() {
        tomatoStalk.setHasBeenFertilized(true);

        assertInstanceOf(Tomato.class, tomatoStalk.yield());
    }
}