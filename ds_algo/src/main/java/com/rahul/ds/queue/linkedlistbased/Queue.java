package com.rahul.ds.queue.linkedlistbased;

public class Queue<T> {
    Node front;
    Node rear;

    public Queue() {
    }

    public Queue(T... elements) {
        for (T ele : elements) enqueue(ele);
    }

    public void enqueue(T element) {
        Node node = new Node(element);

        if (isEmpty()) {
            front = node;
            rear = node;

        } else {
            rear.next = node;
            rear = node;
        }
    }

    public T dequeue() {
        if (isEmpty()) throw new RuntimeException("Underflow");

        Node node = front;
        front = front.next;
        return (T) node.data;
    }

    public boolean isEmpty() {
        return front == null;
    }
}
