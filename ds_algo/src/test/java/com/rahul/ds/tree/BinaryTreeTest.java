package com.rahul.ds.tree;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryTreeTest {
    private static BinaryTree tree = new BinaryTree();

    @Before
    public void setup() {
        tree.root = new Node(8);

        tree.root.left = new Node(3);
        tree.root.right = new Node(5);

        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(9);

        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(2);
    }

    @Test
    public void test_1_preOrderTraverse() {
        tree.preOrderTraverse();
    }

    @Test
    public void test_2_inOrderTraverse() {
        tree.inOrderTraverse();
    }

    @Test
    public void test_3_postOrderTraverse() {
        tree.postOrderTraverse();
    }

    @Test
    public void test_4_levelOrderTraverse() {
        tree.levelOrderTraverse();
    }

    @Test
    public void test_5_countAllNodes() {
        System.out.println("\nCount = " + tree.countAllNodes());
    }
}
