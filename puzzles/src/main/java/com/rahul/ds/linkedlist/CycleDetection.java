package com.rahul.ds.linkedlist;

public class CycleDetection {
    public static void main(String[] args) {
        MyLinkedList list1 = new MyLinkedList(1, 2, 3, 4, 5);
        list1.induceLoop();
        System.out.println(list1.hasLoop());

        MyLinkedList list2 = new MyLinkedList(1, 2, 3, 4, 5);
        System.out.println(list2.hasLoop());
    }
}

class MyLinkedList extends LinkedList {

    public MyLinkedList() {
    }

    public MyLinkedList(int... elements) {
        super(elements);
    }

    public void induceLoop() {
        Node current = head;
        while (current.next != null) current = current.next;
        current.next = head.next.next;
    }

    public boolean hasLoop() {
        Node fast = head;
        Node slow = head;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
            fast = fast == null ? null : fast.next;
            if (slow == fast) return true;
        }

        return false;
    }
}
