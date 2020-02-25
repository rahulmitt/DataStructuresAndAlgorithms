package com.rahul.ds.tree;

import java.util.Arrays;

public class PrintAllPathsFromRootToLeaf {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);

        tree.root.left.left = new Node(3);
        tree.root.left.left.left = new Node(7);
        tree.root.left.right = new Node(5);

        tree.root.right.left = new Node(2);

        printPaths(tree);
    }

    private static void printPaths(BinaryTree tree) {
        int height = tree.height();
        int[] path = new int[height];
        printPaths(tree.root, path, 0);
    }

    private static void printPaths(Node node, int[] path, int i) {
        if (node == null) return;

        path[i++] = node.data;
        if (node.left == null && node.right == null) {
            System.out.print("ROOT --> ");
            for (int j = 0; j < i; j++) System.out.print(path[j] + " -> ");
            System.out.println("NULL");

        } else {
            printPaths(node.left, path, i);
            printPaths(node.right, path, i);
        }
    }
}
