package com.rahul.ds.linkedlist.polynomial;

public class Polynomial {
    public Node head;

    public Polynomial() {
    }

    public void add(Node node) {
        if (head == null) {
            head = node;
            return;
        }

        Node current = head;
        while (current.next != null) current = current.next;
        current.next = node;
    }

    public void add(int coefficient, int exponent) {
        Node node = new Node(coefficient, exponent);
        add(node);
    }

    public int evaluate(int x) {
        if (head == null) return 0;

        Node current = head;
        int sum = 0;
        while (current != null) {
            sum += current.coefficient * Math.pow(x, current.exponent);
            current = current.next;
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HEAD -> ");
        for (Node curr = head; curr != null; curr = curr.next) {
            sb.append(curr + " -> ");
        }
        sb.append("NULL");
        return sb.toString();
    }
}