package com.rahul.ds.linkedlist;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LinkedListTest {
    private static LinkedList list = new LinkedList();

    @Test
    public void test_1_Add() {
        Assert.assertEquals(0, list.count());
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Assert.assertEquals(5, list.count());
    }

    @Test
    public void test_2_Display() {
        list.add(6);
        list.display();
    }

    @Test
    public void test_3_DisplayRecursive() {
        list.displayRecursive();
    }

    @Test
    public void test_4_DisplayReverse() {
        list.displayReverse();
    }

    @Test
    public void test_5_Count() {
        Assert.assertEquals(6, list.count());
    }

    @Test
    public void test_6_CountRecursive() {
        Assert.assertEquals(6, list.countRecursive());
    }

    @Test
    public void test_7_sum() {
        Assert.assertEquals(21, list.sum());
    }

    @Test
    public void test_8_sumRecursive() {
        Assert.assertEquals(21, list.sumRecursive());
    }

    @Test
    public void test_90_max() {
        Assert.assertEquals(6, list.max());
    }

    @Test
    public void test_91_maxRecursive() {
        Assert.assertEquals(6, list.maxRecursive());
    }

    @Test
    public void test_92_linearSearch_successful() {
        Node result = list.linearSearch(5);
        Assert.assertEquals(5, result.data);
    }

    @Test
    public void test_92_linearSearch_unsuccessful() {
        Node result = list.linearSearch(50);
        Assert.assertNull(result);
    }

    @Test
    public void test_93_linearSearchRecursive_successful() {
        Node result = list.linearSearch(4);
        Assert.assertEquals(4, result.data);
    }

    @Test
    public void test_94_linearSearchRecursive_unsuccessful() {
        Node result = list.linearSearch(51);
        Assert.assertNull(result);
    }

    @Test
    public void test_95_binarySearch() {
        LinkedList l = new LinkedList();
        Node n1 = l.binarySearch(1000);
        Assert.assertNull(n1);

        for (int i = 1; i <= 100; i++) {
            l.add(i);
            for (int j = 1; j <= i; j++) {
                Node result = l.binarySearch(j);
                Assert.assertEquals(j, result.data);
            }

            Node failure = l.binarySearch(1000);
            Assert.assertNull(failure);
        }
    }

    @Test
    public void test_96_insert() {
        LinkedList l = new LinkedList();
//        l.add(2);
//        l.add(4);
//        l.add(6);
//        l.add(8);
        l.insert(0, 8);
        l.insert(0, 6);
        l.insert(0, 4);
        l.insert(0, 2);

        l.display();
        l.insert(0, 1);
        l.display();
        l.insert(2, 3);
        l.display();
        l.insert(4, 5);
        l.display();
        l.insert(6, 7);
        l.display();
        l.insert(8, 9);
        l.display();
        l.insert(9, 10);
        l.display();
//        l.insert(11, 50);
    }

    @Test
    public void test_97_deletion() {
        LinkedList l = new LinkedList();
        for (int i = 1; i <= 5; i++) l.add(i);
        l.display();

        for (int i = 0; i < 5; i++) {
            System.out.println("Deleted = " + l.delete(0));
            l.display();
        }

        for (int i = 1; i <= 5; i++) l.add(i);
        l.display();

        System.out.println("Deleted = " + l.delete(4));
        l.display();

        System.out.println("Deleted = " + l.delete(1));
        l.display();

        System.out.println("Deleted = " + l.delete(1));
        l.display();

        System.out.println("Deleted = " + l.delete(0));
        l.display();

        System.out.println("Deleted = " + l.delete(0));
        l.display();

    }

    @Test
    public void test_98_isSorted() {
        Assert.assertTrue(list.isSorted());
        list.add(20);
        Assert.assertTrue(list.isSorted());
        list.add(25);
        Assert.assertTrue(list.isSorted());
        list.add(26);
        Assert.assertTrue(list.isSorted());
        list.add(27);
        Assert.assertTrue(list.isSorted());
        list.add(28);
        Assert.assertTrue(list.isSorted());
        list.add(10);
        Assert.assertFalse(list.isSorted());
        list.add(11);
        Assert.assertFalse(list.isSorted());
        list.add(12);
        Assert.assertFalse(list.isSorted());
    }

    @Test
    public void test_99_removeDuplicates() {
        LinkedList l = new LinkedList(1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10);
        l.display();
        Assert.assertEquals(12, l.count());
        l.removeDuplicates();
        Assert.assertEquals(10, l.count());
        l.display();
    }

    @Test
    public void test_991_reverse() {
        LinkedList l = new LinkedList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        l.reverse();
        l.display();
    }

    @Test
    public void test_992_reverseRecursive() {
        LinkedList l = new LinkedList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        l.display();
        l.reverseRecursive();
        l.display();
    }
}
