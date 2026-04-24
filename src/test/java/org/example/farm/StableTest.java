package org.example.farm;

import org.example.animal.Horse;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StableTest {
    private Horse horse;
    private Horse horse2;
    private Horse horse3;

    private Stable stable;
    private Stable stable2;
    private Stable stable3;

    @BeforeEach
    void setUp() {
        stable = new Stable();
        horse = new Horse("Spirit");
        horse2 = new Horse("Seabiscut");
        horse3 = new Horse("Mustang");
    }

    @Test
    void getAndAddHorse() {

        stable.addHorse(horse);
        stable.addHorse(horse);

        var expected = 2;

        assertEquals(expected, stable.getHorses().size());

    }

    @Test
    void testToString() {
        var expected = "Horses: Spirit, Seabiscut, Mustang";
        stable.addHorse(horse);
        stable.addHorse(horse2);
        stable.addHorse(horse3);

        assertEquals(expected, stable.toString());

    }
}