package com.rahul.ds.stack.linkedlistbased;

public class StackBackedByLinkedList {
    private Node top;
    private int size;
    private int length;

    public StackBackedByLinkedList(int size) {
        this.size = size;
        this.length = 0;
    }

    public void push(int element) {
        if (isFull()) throw new RuntimeException("Overflow");

        Node node = new Node(element);
        node.next = top;
        top = node;
        length++;
    }

    public int pop() {
        if (isEmpty()) throw new RuntimeException("Underflow");

        Node node = top;
        top = top.next;
        length--;
        return node.data;
    }

    public int peek() {
        if (isEmpty()) throw new RuntimeException("Underflow");
        return top.data;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public boolean isFull() {
        return length == size;
    }
}
