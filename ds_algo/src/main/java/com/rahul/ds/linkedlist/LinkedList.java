package com.rahul.ds.linkedlist;

public class LinkedList {
    protected Node head;

    public LinkedList() {
    }

    public LinkedList(int... elements) {
        for (int data : elements) {
            add(data);
        }
    }

    public void add(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }

        Node current = head;
        while (current.next != null) current = current.next;
        current.next = node;
    }

    public int count() {
        int count = 0;
        for (Node current = head; current != null; current = current.next) count++;
        return count;
    }

    public int countRecursive() {
        return countRecursive(head);
    }

    private int countRecursive(Node current) {
        if (current == null) return 0;
        return countRecursive(current.next) + 1;
    }

    public void display() {
        System.out.print("HEAD -> ");
        for (Node current = head; current != null; current = current.next) System.out.print(current.data + " -> ");
        System.out.println("NULL");
    }

    public void displayRecursive() {
        System.out.println();
        displayRecursive(head);
    }

    private void displayRecursive(Node current) {
        if (current == null) return;

        System.out.print(current.data + " -> ");
        displayRecursive(current.next);
    }

    public void displayReverse() {
        System.out.println();
        displayReverse(head);
    }

    private void displayReverse(Node current) {
        if (current == null) return;

        displayReverse(current.next);
        System.out.print(current.data + " -> ");
    }

    public int sum() {
        int sum = 0;
        for (Node current = head; current != null; current = current.next) sum += current.data;
        return sum;
    }

    public int sumRecursive() {
        return sumRecursive(head);
    }

    private int sumRecursive(Node current) {
        if (current == null) return 0;
        return current.data + sumRecursive(current.next);
    }

    public int max() {
        int max = Integer.MIN_VALUE;
        for (Node current = head; current != null; current = current.next) {
            if (current.data > max) max = current.data;
        }
        return max;
    }

    public int maxRecursive() {
        return maxRecursive(head);
    }

    private int maxRecursive(Node current) {
        if (current == null) return Integer.MIN_VALUE;
        return Math.max(current.data, maxRecursive(current.next));
    }

    public Node linearSearch(int data) {
        for (Node current = head; current != null; current = current.next) {
            if (current.data == data) return current;
        }
        return null;
    }

    public Node linearSearchRecursive(int data) {
        return linearSearchRecursive(head, data);
    }

    public Node linearSearchRecursive(Node current, int data) {
        if (current == null) return null;
        if (current.data == data) return current;
        return linearSearchRecursive(current.next, data);
    }

    /*
        Binary Search is not suitable for Linked-List
        because we cannot directly reach the middle in constant time
        as we will have to traverse from head sequentially
    */
    public Node binarySearch(int data) {
        if (head == null) return null;

        Node low = head;
        Node high = getLastElement(low);

        while (high.next != low) {  // low <= high
            Node mid = getMiddleElement(low, high);
            if (data < mid.data) high = getPrevious(low, mid);
            else if (data > mid.data) low = mid.next;
            else return mid;
        }

        return null;
    }

    private Node getPrevious(Node i, Node current) {
        while (i.next != null && i.next != current) i = i.next;
        if (i.next == current) return i;
        else return null;
    }

    private Node getLastElement(Node i) {
        while (i.next != null) i = i.next;
        return i;
    }

    private Node getMiddleElement(Node low, Node high) {
        if (low == high) return low;

        Node slow = low;
        Node fast = low;
        while (fast != null && fast.next != high) {
            fast = fast.next;
            if (fast != null && fast.next != high) {
                slow = slow.next;
                fast = fast.next;
            }
        }
        return slow;
    }

    public void insert(int index, int data) {
        Node node = new Node(data);

        if (index == 0) {
            node.next = head;
            head = node;

        } else {
            int i = 1;
            Node current = head;
            while (current.next != null) {
                if (i == index) break;
                i++;
                current = current.next;
            }

            if (i == index) {
                node.next = current.next;
                current.next = node;
            } else {
                throw new RuntimeException("Index out of bounds");
            }
        }
    }

    public Node delete(int index) {
        if (head == null) throw new RuntimeException("Underflow");
        Node deleted;
        if (index == 0) {
            deleted = head;
            head = head.next;
        } else {
            int i = 0;
            Node previous = head;
            while (previous.next != null) {
                if (i == index - 1) break;
                i++;
                previous = previous.next;
            }

            if (previous.next == null) throw new RuntimeException("Underflow");
            deleted = previous.next;
            previous.next = previous.next.next;
        }

        return deleted;
    }

    public boolean isSorted() {
        if (head == null || head.next == null) return true;

        Node previous = head;
        Node current = head.next;

        while (current != null) {
            if (previous.data > current.data) return false;
            previous = current;
            current = current.next;
        }
        return true;
    }

    public void removeDuplicates() {
        if (head == null || head.next == null) return;
        Node previous = head;
        Node current = head.next;

        while (current != null) {
            if (previous.data == current.data) {
                previous.next = current.next;
                current = current.next;
            } else {
                previous = previous.next;
                current = current.next;
            }
        }
    }

    public void reverse() {
        if (head == null || head.next == null) return;
        Node previous = null;
        Node current = null;
        Node next = head;

        while (next != null) {
            previous = current;
            current = next;
            next = next.next;
            current.next = previous;
        }
        head = current;
    }

    public void reverseRecursive() {
        head = reverseRecursive(head);
    }

    private Node reverseRecursive(Node current) {
        if (current.next == null) return current;
        Node next = reverseRecursive(current.next);
        current.next.next = current;
        current.next = null;
        return next;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HEAD --> ");
        for (Node i = head; i != null; i = i.next) sb.append(i + " -> ");
        sb.append("NULL");
        return sb.toString();
    }
}
