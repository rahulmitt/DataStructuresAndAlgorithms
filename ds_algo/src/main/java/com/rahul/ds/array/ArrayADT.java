package com.rahul.ds.array;

import java.util.Arrays;

/*
    OPERATIONS:                                                                                     TIME COMPLEXITY
    display()           - Visit all the elements of the array one by one                            O(n)
    add(x) / append(x)  - Add a new element at the end of the array                                 O(1)
    insert(index, x)    - Insert an element at a given index                                        O(n)
    delete(index)       - Delete an element at a given index                                        O(n)
    linearSearch(x)     - Search the given element and return the index                             O(n)
    binarySearch(x)     - Search the given element and return the index                             O(log n)
    get(index)          - Get the element at a given index                                          O(1)
    set(index, x)       - Replace the element at a given index                                      O(1)
    max()               - Find the max element in unsorted array                                    O(n)
    min()               - Find the min element in unsorted array                                    O(n)
    reverse()
    shift()
    rotate()
*/
public class ArrayADT {
    private int[] a;
    private int size = 10;
    private int length;

    public ArrayADT(int size) {
        this.size = size;
    }

    public ArrayADT() {
        a = new int[size];
        a[0] = 8;
        a[1] = 3;
        a[2] = 7;
        a[3] = 12;
        a[4] = 6;
        a[5] = 9;

        length = 6;
    }

    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
    }

    public void add(int x) {
        if (length == size) throw new IllegalStateException("Overflow");
        a[length++] = x;
    }

    public void insert(int index, int x) {
        if (length == size) throw new IllegalStateException("Overflow");
        if (index < 0 || index > length + 1) throw new IllegalArgumentException("Invalid index " + index);

        for (int i = length; i > index; i--) a[i] = a[i - 1];
        a[index] = x;
        length++;
    }

    public int delete(int index) {
        if (index < 0 || index > length - 1) throw new IllegalArgumentException("Invalid index " + index);
        int element = a[index];
        for (int i = index; i < length - 1; i++) a[i] = a[i + 1];
        length--;
        return element;
    }

    public int linearSearch(int x) {
        for (int i = 0; i < length; i++) {
            if (a[i] == x) return i;
        }

        return -1;
    }

    // Pre-Condition: the array should be sorted
    public int binarySearch(int x) {
        int low = 0;
        int high = length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == a[mid]) return mid;
            else if (x < a[mid]) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }

    public int binarySearchRecursive(int x) {
        return binarySearchRecursive(0, length - 1, x);
    }

    // tail recursion
    private int binarySearchRecursive(int low, int high, int x) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (x == a[mid]) return mid;
        else if (x < a[mid]) return binarySearchRecursive(low, mid - 1, x);
        return binarySearchRecursive(mid + 1, high, x);
    }

    public int get(int index) {
        if (index < 0 || index >= length) throw new IllegalArgumentException("Invalid index " + index);
        return a[index];
    }

    public void set(int index, int x) {
        if (index < 0 || index >= length) throw new IllegalArgumentException("Invalid index " + index);
        a[index] = x;
    }

    public int max() {
        int max = a[0];
        for (int i = 1; i < length; i++) {
            if (a[i] > max) max = a[i];
        }
        return max;
    }

    public int min() {
        int min = a[0];
        for (int i = 1; i < length; i++) {
            if (a[i] < min) min = a[i];
        }
        return min;
    }

    public int sum() {
        int sum = a[0];
        for (int i = 1; i < length; i++) sum += a[i];
        return sum;
    }

    public int sumRecursive() {
        return sumRecursive(a, length - 1);
    }

    private int sumRecursive(int[] a, int n) {
        if (n == 0) return 0;
        return a[n] + sumRecursive(a, n - 1);
    }

    public int avg() {
        int sum = a[0];
        for (int i = 1; i < length; i++) sum += a[i];
        return sum / length;
    }

    public void reverseUsingAuxiliaryArray() {
        int temp[] = new int[length];
        for (int i = 0; i < length; i++) temp[0] = a[length - i - 1];
        for (int i = 0; i < temp.length; i++) a[i] = temp[i];
    }

    // without auxiliary array
    public void reverseUsingSwapMethod() {
        for (int i = 0, j = length; i < j; i++, i--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    public void leftShift() {
        int temp = a[0];
        for (int i = 1; i < length - 1; i++) a[i] = a[i + 1];
    }

    public void leftRotate() {
        int temp = a[0];
        for (int i = 1; i < length - 1; i++) a[i] = a[i + 1];
        a[length - 1] = temp;
    }

    public void insertInSortedList(int x) {
        int i = length - 1;
        while (a[i] > x) a[i + 1] = a[i];
        a[i + 1] = x;
        length++;
    }

    public boolean isSorted() {
        for (int i = 1; i < length; i++) {
            if (a[i - 1] > a[i]) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return Arrays.toString(a);
    }
}
