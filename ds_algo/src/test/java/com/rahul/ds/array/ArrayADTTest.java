package com.rahul.ds.array;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArrayADTTest {

    private static ArrayADT arrayADT = new ArrayADT();

    @Test
    public void test_1_Display() {
        arrayADT.display();
    }

    @Test
    public void test_2_Add() {
        arrayADT.add(15);
        arrayADT.display();
    }

    @Test
    public void test_3_Insert() {
        arrayADT.insert(0, 10);
        arrayADT.display();
    }

    @Test
    public void test_4_Delete() {
        int element = arrayADT.delete(0);
        System.out.print("Deleted: " + element + " :: ");
        arrayADT.display();
    }
}
