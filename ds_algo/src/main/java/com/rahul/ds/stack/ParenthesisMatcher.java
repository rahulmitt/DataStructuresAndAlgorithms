package com.rahul.ds.stack;

import com.rahul.ds.stack.arraybased.StackBackedByArray;

public class ParenthesisMatcher {

    private static StackBackedByArray stack;

    private static final char OPENING_BRACKET = '(';
    private static final char CLOSING_BRACKET = ')';

    private static final char OPENING_CURLY_BRACE = '{';
    private static final char CLOSING_CURLY_BRACE = '}';

    private static final char OPENING_SQUARE_BRACKET = '[';
    private static final char CLOSING_SQUARE_BRACKET = ']';

    public static void main(String[] args) {
        stack = new StackBackedByArray(Character.class, 10);
        String expression = "{((a+b)*(c-d))}";
        for (char c : expression.toCharArray()) {
            switch (c) {
                case OPENING_CURLY_BRACE:
                case OPENING_BRACKET:
                case OPENING_SQUARE_BRACKET:
                    stack.push(c);
                    break;

                case CLOSING_CURLY_BRACE:
                case CLOSING_BRACKET:
                case CLOSING_SQUARE_BRACKET:

                    try {
                        switch (c) {
                            case CLOSING_CURLY_BRACE:
                                if (!stack.peek().equals(OPENING_CURLY_BRACE)) {
                                    System.out.println("Mismatch");
                                    return;
                                }
                                break;

                            case CLOSING_BRACKET:
                                if (!stack.peek().equals(OPENING_BRACKET)) {
                                    System.out.println("Mismatch");
                                    return;
                                }
                                break;

                            case CLOSING_SQUARE_BRACKET:
                                if (stack.peek().equals(OPENING_SQUARE_BRACKET)) {
                                    System.out.println("Mismatch");
                                    return;
                                }
                                break;
                        }

                        stack.pop();
                    } catch (RuntimeException e) {
                        System.out.println("Mismatch");
                        System.exit(0);
                    }
                    break;
            }
        }

        if (stack.isEmpty()) System.out.println("Matches");
        else System.out.println("Mismatch");
    }
}
