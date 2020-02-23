package com.rahul.ds.tree;

public class Node {
    public Node left;
    public int data;
    public Node right;

    public Node(int data) {
        this.data = data;
    }

    public boolean hasLeft() {
        return left != null;
    }

    public boolean hasRight() {
        return right != null;
    }

    @Override
    public String toString() {
        return "[ " + data + " ]";
    }
}
