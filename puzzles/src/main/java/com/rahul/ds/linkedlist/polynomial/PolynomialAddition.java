package com.rahul.ds.linkedlist.polynomial;

public class PolynomialAddition {
    public static void main(String[] args) {
        // 4x^3 + 9x^2 + 6x + 7
        Polynomial poly1 = new Polynomial();
        poly1.add(4, 3);
        poly1.add(9, 2);
        poly1.add(6, 1);
        poly1.add(7, 0);

        // 5x^3 + 3x + 4
        Polynomial poly2 = new Polynomial();
        poly2.add(5, 3);
        poly2.add(3, 1);
        poly2.add(4, 0);

        Polynomial poly3 = add(poly1, poly2);
        System.out.println("poly1: " + poly1);
        System.out.println("poly2: " + poly2);
        System.out.println("poly3: " + poly3);
        int result = poly3.evaluate(5);
        System.out.println("Polinomial Evaluation: " + result);

    }

    private static Polynomial add(Polynomial poly1, Polynomial poly2) {
        Node curr1 = poly1.head;
        Node curr2 = poly2.head;

        Polynomial poly3 = new Polynomial();
        while (curr1 != null && curr2 != null) {
            Node node;
            if (curr1.exponent > curr2.exponent) {
                node = new Node(curr1.coefficient, curr1.exponent);
                curr1 = curr1.next;

            } else if (curr1.exponent < curr2.exponent) {
                node = new Node(curr2.coefficient, curr2.exponent);
                curr2 = curr2.next;

            } else {
                node = new Node(curr1.coefficient + curr2.coefficient, curr1.exponent);
                curr1 = curr1.next;
                curr2 = curr2.next;
            }

            poly3.add(node);
        }

        while (curr1 != null) {
            poly3.add(curr1.coefficient, curr1.exponent);
            curr1 = curr1.next;
        }

        while (curr2 != null) {
            poly3.add(curr2.coefficient, curr2.exponent);
            curr1 = curr2.next;
        }

        return poly3;
    }
}
