package org.example.farm;

import org.example.animal.Chicken;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;

class ChickenCoopTest {
    private ChickenCoop chickenCoop;
    private Chicken chick1;
    private Chicken chick2;
    private Chicken chick3;
    private Chicken chick4;
    private Chicken chick5;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();




    @BeforeEach
    void setUp(){
        chickenCoop = new ChickenCoop();
        chick1 = new Chicken("chick lil");
        chick2 = new Chicken("popeyes");
        chick3 = new Chicken("kfc");
        chick4 = new Chicken("chick fil a");
        chick5 = new Chicken("wing stop");


    }

    @Test
    void getAndAddChickens() {
        chickenCoop.addChicken(chick1);
        chickenCoop.addChicken(chick2);
        chickenCoop.addChicken(chick3);
        chickenCoop.addChicken(chick4);
        chickenCoop.addChicken(chick5);

        assertEquals(5 , chickenCoop.getChickens().size());
    }


}