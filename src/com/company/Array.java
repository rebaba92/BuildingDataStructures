package com.company;

import java.util.Scanner;

public class Array {
    Scanner scanner = new Scanner(System.in);
    int length;
    int A[];

    //create an Array and initialize the size.
    public Array() {
        System.out.println("Enter number of numbers");
        length = scanner.nextInt();
        A = new int[length];
        System.out.println("Array with size of " + A.length + " has been created");
    }

    //display contents on an Array
    public void display(int A[]) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + ",");
        }
    }
    public void add(int n) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != 0) {
                count++;
            }
            if (count == A.length) {
                System.out.println("There are no free spaces left in the Array.");
            }
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                A[i] = n;
                System.out.println(n + " added to the array sucessfully.");
                break;
            }
        }
    }
    //insert at chosen index.
    public void insert(int index, int n) {
        int endingIndex = 0;
        if (index < A.length && index > 0) {
            //get the index of the first 0 value.
            for(int i = 0; i < A.length; i++) {
                if (A[i] == 0) {
                    endingIndex = i;
                    System.out.println(endingIndex);
                    break;
                }
            }
        }
        //shift the elements in the array.
        for(int i = endingIndex; i > index; i--){
            A[i] = A[i - 1];
            System.out.println(endingIndex);
        }
        A[index] = n;
    }


}
