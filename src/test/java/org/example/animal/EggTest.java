package org.example.animal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EggTest {
    private Chicken chicken;

    @BeforeEach
    void setUp() {
        chicken = new Chicken("stuart");
        chicken.setHasBeenFertilized(true);

    }


    @Test
    void getIfEdible() {
        var egg = chicken.yield();
        assertTrue(egg.getIfEdible());
    }
}