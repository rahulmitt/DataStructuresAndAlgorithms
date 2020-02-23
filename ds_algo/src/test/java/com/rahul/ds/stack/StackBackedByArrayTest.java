package com.rahul.ds.stack;

import com.rahul.ds.stack.arraybased.StackBackedByArray;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StackBackedByArrayTest {

    private static StackBackedByArray stack = new StackBackedByArray(Integer.class, 10);

    @Test
    public void test_1_push() {
        Assert.assertTrue(stack.isEmpty());
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
            ;
        }
        Assert.assertTrue(stack.isFull());
        Assert.assertEquals(10, stack.peek());
    }

    @Test
    public void test_2_pop() {
        Assert.assertTrue(stack.isFull());
        Assert.assertEquals(10, stack.pop());
        Assert.assertEquals(9, stack.pop());
        Assert.assertEquals(8, stack.pop());
        Assert.assertEquals(7, stack.pop());
        Assert.assertFalse(stack.isFull());
        Assert.assertFalse(stack.isEmpty());
    }

    @Test
    public void test_3_pook() {
        for (int i = 6; i >= 1; i--) {
            Assert.assertEquals(i, stack.peek());
            Assert.assertEquals(i, stack.pop());
        }
        Assert.assertFalse(stack.isFull());
        Assert.assertTrue(stack.isEmpty());
    }
}
