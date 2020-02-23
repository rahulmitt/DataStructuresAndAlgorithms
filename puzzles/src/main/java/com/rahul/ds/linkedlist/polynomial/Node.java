package com.rahul.ds.linkedlist.polynomial;

public class Node {
    public int coefficient;
    public int exponent;
    public Node next;

    public Node(int coefficient, int exponent) {
        this.coefficient = coefficient;
        this.exponent = exponent;
    }

    @Override
    public String toString() {
        return "[ " + coefficient + " * x^" + exponent + " ]";
    }
}
