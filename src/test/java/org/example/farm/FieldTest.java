package org.example.farm;

import org.example.crop.CornStalk;
import org.example.crop.TomatoStalk;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FieldTest {
    private Field field;
    private CropRow cropRow;
    private CropRow cropRow2;

    @BeforeEach
    void setUp() {
        field = new Field();
        cropRow = new CropRow();
        cropRow2 = new CropRow();

    }


    @Test
    void getAndAddCropRows() {
        field.addCropRow(cropRow);
        field.addCropRow(cropRow2);

        var expected = 2;

        assertEquals(expected, field.getCropRows().size());
   }


    @Test
    void testToString() {
        field.addCropRow(cropRow);
        var expected = "Field: Crop-Rows=1";

        assertEquals(expected, field.toString());
    }
}