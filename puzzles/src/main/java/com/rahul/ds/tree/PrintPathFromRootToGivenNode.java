package com.rahul.ds.tree;

public class PrintPathFromRootToGivenNode {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);

        tree.root.left.left = new Node(3);
        tree.root.left.left.left = new Node(7);
        tree.root.left.right = new Node(5);

        tree.root.right.left = new Node(2);

        printPaths(tree, 20);
    }

    private static void printPaths(BinaryTree tree, int element) {
        int height = tree.height();
        int[] path = new int[height];
        printPaths(tree.root, path, 0, element);
    }

    private static void printPaths(Node node, int[] path, int i, int element) {
        if (node == null) return;

        path[i++] = node.data;
        if (node.data == element) {
            System.out.print("ROOT --> ");
            for (int j = 0; j < i; j++) System.out.print(path[j] + " -> ");
            return;
        }

        printPaths(node.left, path, i, element);
        printPaths(node.right, path, i, element);
    }
}
