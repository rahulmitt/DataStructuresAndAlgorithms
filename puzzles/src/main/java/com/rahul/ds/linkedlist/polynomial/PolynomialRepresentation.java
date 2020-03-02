package com.rahul.ds.linkedlist.polynomial;

public class PolynomialRepresentation {
    public static void main(String[] args) {
        // 4x^3 + 9x^2 + 6x + 7
        Polynomial poly = new Polynomial();
        poly.add(4, 3);
        poly.add(9, 2);
        poly.add(6, 1);
        poly.add(7, 0);

        /*
            For x=5,
             4x^3 + 9x^2 + 6x + 7

             = 4(5^3) + 9(5^2) + 6(5^1) + 7(5^0)
             = 4*125 + 9*25 + 6*5 + 7*1
             = 500 + 225 + 30 + 7
             = 762
        */
        System.out.println(poly);
        int result = poly.evaluate(5);
        System.out.println("Polinomial Evaluation: " + result);

    }


}