package com.rahul.ds.stack.linkedlistbased;

public class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "[ " + data + " ]";
    }
}
