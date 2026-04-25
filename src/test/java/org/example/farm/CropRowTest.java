package org.example.farm;

import org.example.crop.CornStalk;
import org.example.crop.Crop;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CropRowTest {
    private CropRow cropRow;
    private CornStalk cornStalk;
    private CornStalk cornStalk2;
    private CornStalk cornStalk3;
    private ArrayList<Crop> crops;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();


    @BeforeEach
    void setUp() {
        cropRow = new CropRow();
        cornStalk = new CornStalk();
        cornStalk2 = new CornStalk();
        cornStalk3 = new CornStalk();
        crops = new ArrayList<>();
        System.setOut(new PrintStream(outputStreamCaptor));

    }


    @Test
    void addAndFertilizeAllCrops() {
        var expected = "All crops have been fertilized!";

        cropRow.addCrop(cornStalk);
        cropRow.addCrop(cornStalk2);
        cropRow.addCrop(cornStalk3);

        cropRow.fertilizeAllCrops();
        assertEquals(expected, outputStreamCaptor.toString().trim());


        assertTrue(cornStalk.isHasBeenFertilized());
        assertTrue(cornStalk2.isHasBeenFertilized());
        assertTrue(cornStalk3.isHasBeenFertilized());
    }

    @Test
    void addAndHarvestAllCrops() {
        var expected = "All crops have been harvested!";
        var expected2 = "All crops have been fertilized!";
        cropRow.addCrop(cornStalk);
        cropRow.addCrop(cornStalk2);
        cropRow.addCrop(cornStalk3);
        cropRow.fertilizeAllCrops();

        assertEquals(expected2, outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();


        cropRow.harvestAllCrops();
        assertEquals(expected, outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        assertFalse(cornStalk.isHasBeenFertilized());
        assertFalse(cornStalk2.isHasBeenFertilized());
        assertFalse(cornStalk3.isHasBeenFertilized());
    }



    @Test
    void getCrops() {
        cropRow.addCrop(cornStalk);
        cropRow.addCrop(cornStalk2);
        cropRow.addCrop(cornStalk3);

        var expected = 3;

        assertEquals(expected, cropRow.getCrops().size());


    }

    @Test
    void setCrops() {
        crops.add(cornStalk);

        cropRow.setCrops(crops);
        var expected = 1;
        assertEquals(expected, cropRow.getCrops().size());
    }
}