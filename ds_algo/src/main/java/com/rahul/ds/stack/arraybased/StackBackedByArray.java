package com.rahul.ds.stack.arraybased;

import java.lang.reflect.Array;

public class StackBackedByArray<T> {
    private T[] arr;
    private int top = -1;

    @SuppressWarnings("unchecked")
    public StackBackedByArray(Class<T> clazz, int capacity) {
        arr = (T[]) Array.newInstance(clazz, capacity);
    }

    public void push(T element) {
        if (isFull()) throw new RuntimeException("Overflow");
        arr[++top] = element;
    }

    public T pop() {
        if (isEmpty()) throw new RuntimeException("Underflow");
        return arr[top--];
    }

    public T peek() {
        if (top == -1) throw new RuntimeException("Underflow");
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == arr.length - 1;
    }
}
