package com.rahul.ds.tree;

import com.rahul.ds.queue.linkedlistbased.Queue;

/*
    Count Nodes:
        1. All nodes with Degree 0 (Leaf Nodes)               ==> if (!node.hasLeft() && !node.hasRight())
        2. All nodes with Degree 1                            ==> if ( (node.hasLeft() && !node.hasRight()) || (!node.hasLeft() && node.hasRight()) )
        3. All nodes with Degree 2                            ==> if (node.hasLeft() && node.hasRight())
        4. All nodes with Degree 1 and 2 (All internal nodes) ==> if (node.hasLeft() || node.hasRight())
*/
public class BinaryTree {
    public Node root;

    public BinaryTree() {
    }

    public void preOrderTraverse() {
        System.out.print("\nPRE-ORDER: ");
        preOrderTraverse(root);
    }

    private void preOrderTraverse(Node node) {
        if (node == null) return;
        System.out.print(node.data + " -> ");
        preOrderTraverse(node.left);
        preOrderTraverse(node.right);
    }

    public void postOrderTraverse() {
        System.out.print("\nPOST-ORDER: ");
        postOrderTraverse(root);
    }

    private void postOrderTraverse(Node node) {
        if (node == null) return;
        postOrderTraverse(node.left);
        postOrderTraverse(node.right);
        System.out.print(node.data + " -> ");
    }

    public void inOrderTraverse() {
        System.out.print("\nIN-ORDER: ");
        inOrderTraverse(root);
    }

    private void inOrderTraverse(Node node) {
        if (node == null) return;
        inOrderTraverse(node.left);
        System.out.print(node.data + " -> ");
        inOrderTraverse(node.right);
    }

    public void levelOrderTraverse() {
        System.out.print("\nLEVEL-ORDER: ");
        if (root == null) return;
        System.out.print(root.data + " -> ");
        Queue<Node> queue = new Queue<>();
        queue.enqueue(root);

        while (!queue.isEmpty()) {
            Node node = queue.dequeue();
            if (node.hasLeft()) {
                System.out.print(node.left.data + " -> ");
                queue.enqueue(node.left);
            }

            if (node.hasRight()) {
                System.out.print(node.right.data + " -> ");
                queue.enqueue(node.right);
            }
        }
    }

    public int countAllNodes() {
        return countAllNodes(root);
    }

    private int countAllNodes(Node node) {
        if (node == null) return 0;
        int leftCount = countAllNodes(node.left);
        int rightCount = countAllNodes(node.right);
        return leftCount + rightCount + 1;
    }

    public int countLeafNodes() {
        return countNodesWithDegree0(root);
    }

    private int countNodesWithDegree0(Node node) {
        if (node == null) return 0;
        int leftCount = countNodesWithDegree0(node.left);
        int rightCount = countNodesWithDegree0(node.right);

        if (!node.hasLeft() && !node.hasRight()) {
            return leftCount + rightCount + 1;
        } else {
            return leftCount + rightCount;
        }
    }

    private int countNodesWithDegree2(Node node) {
        if (node == null) return 0;
        int leftCount = countNodesWithDegree2(node.left);
        int rightCount = countNodesWithDegree2(node.right);

        if (node.hasLeft() && node.hasRight()) {
            return leftCount + rightCount + 1;
        } else {
            return leftCount + rightCount;
        }
    }

    public int countInternalNodes() {
        return countNodesWithDegree1and2(root);
    }

    private int countNodesWithDegree1and2(Node node) {
        if (node == null) return 0;
        int leftCount = countNodesWithDegree1and2(node.left);
        int rightCount = countNodesWithDegree1and2(node.right);

        if (node.hasLeft() || node.hasRight()) {
            return leftCount + rightCount + 1;
        } else {
            return leftCount + rightCount;
        }
    }

}
