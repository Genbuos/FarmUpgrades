package org.example.person;

import org.example.crop.Tomato;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    private Farmer farmer;
    private Tomato tomato;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();



    @BeforeEach
    void setUp() {
        farmer = new Farmer("Jordan", "Fo-sho!");
        tomato = new Tomato();
        System.setOut(new PrintStream(outputStreamCaptor));


    }


    @Test
    void getName() {
        var expected = "Jordan";

        assertEquals(expected, farmer.getName());

    }

    @Test
    void setName() {
        var expected = "Jordy";
        farmer.setName("Jordy");
        assertEquals(expected, farmer.getName());
    }

    @Test
    void getQuip() {
        var expected = "Fo-sho!";

        assertEquals(expected, farmer.getQuip());
    }

    @Test
    void setQuip() {
        var expected = "Mos def!";

        assertNotEquals(expected, farmer.getQuip());

        farmer.setQuip("Mos def!");

        assertEquals(expected, farmer.getQuip());

    }
    @Test
    void eatAndGetStomach() {
        farmer.eat(tomato);

        assertEquals(1, farmer.getStomach());
    }


}