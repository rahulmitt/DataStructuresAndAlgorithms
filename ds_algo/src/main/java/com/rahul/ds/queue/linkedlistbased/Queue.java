package com.rahul.ds.queue.linkedlistbased;

public class Queue<T> {
    Node<T> front;
    Node<T> rear;

    public Queue() {
    }

    public Queue(T... elements) {
        for (T ele : elements) enqueue(ele);
    }

    public void enqueue(T element) {
        Node<T> node = new Node<>(element);

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

        Node<T> node = front;
        front = front.next;
        return node.data;
    }

    public boolean isEmpty() {
        return front == null;
    }
}
