package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    Scanner scanner = new Scanner(System.in);
    int length;
    int[] A;

    //create an Array and initialize the size.
    public Array() {
        System.out.println("Enter the size of the Array");
        length = scanner.nextInt();
        A = new int[length];
        System.out.println("Array with size of " + A.length + " has been created");
    }

    //display contents on an Array
    public void display(int[] A) {
        for (int n : A) {
            System.out.print(n + ",");
        }
    }

    public void add(int n) {
        int count = 0;
        //for loop to check if the array is full.
        for (int j : A) {
            if (j != 0) {
                count++;
            }
            if (count == A.length) {
                System.out.println("There are no free spaces left in the Array.");
            }
        }
        //if not full, then find the first 0. aka null value.
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                A[i] = n;
                System.out.println(n + " added to the array successfully.");
                break;
            }
        }
    }

    //insert at chosen index.
    public void insert(int index, int n) {
        int endingIndex = 0;
        if (index < A.length && index >= 0) {
            //get the index of the first 0 value.
            for (int i = 0; i < A.length; i++) {
                if (A[i] == 0) {
                    endingIndex = i;
                    break;
                }
            }
            //shift the elements in the array.
            for (int i = endingIndex; i > index; i--) {
                A[i] = A[i - 1];
                System.out.println(endingIndex);
            }
            A[index] = n;
        } else {
            System.out.println("There is no room to insert into this array.");
        }
    }

    public void delete(int index) {
        int endingIndex = 0;
        if (index < A.length && index >= 0) {
            //get the index of the first 0 value.
            for (int i = 0; i < A.length; i++) {
                if (A[i] == 0) {
                    endingIndex = i;
                    break;
                }
            }
            A[index] = 0;
            //left shift all the elements.
            for (int i = index; i < endingIndex; i++) {
                A[i] = A[i + 1];
            }
        } else {
            System.out.println("The index is out of bounds.");
        }
    }

    //creating a linear search
    public int linearSearch(int key) {
        for (int i = 0; i < A.length; i++) {
            if (key == A[i]) {
                swap(A[i], A[0]);
                return 0;
            }
        }
        return -1;
    }

    private void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public int binarySearch(int[] A, int key) {
        int low = 0;
        int high = A.length - 1;
        //sort the array before performing the search.
        Arrays.sort(A);

        while (low <= high) {
            int mid = (low + high) / 2;
            if (key == A[mid]) {
                return mid;
            } else if (key < A[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public int recursiveBinSearch(int[] A, int low, int high, int key) {
        Arrays.sort(A);
        int mid;
        if (low <= high) {
            mid = (low + high) / 2;
            if (key == A[mid]) {
                return mid;
            } else if (key < A[mid]) {
                return recursiveBinSearch(A, low, mid - 1, key);
            } else {
                return recursiveBinSearch(A, mid + 1, high, key);
            }
        }
        return -1;
    }

}
