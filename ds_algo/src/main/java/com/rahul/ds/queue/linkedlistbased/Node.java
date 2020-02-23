package com.rahul.ds.queue.linkedlistbased;

public class Node<T> {
    public T data;
    public Node next;

    public Node(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "[ " + data + " ]";
    }
}
