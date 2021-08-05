package com.company;

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
        for (int n: A) {
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
        if (index < A.length && index > 0) {
            //get the index of the first 0 value.
            for(int i = 0; i < A.length; i++) {
                if (A[i] == 0) {
                    endingIndex = i;
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

    public void delete(int index){
        int endingIndex = 0;
        if (index < A.length && index >= 0) {
            //get the index of the first 0 value.
            for(int i = 0; i < A.length; i++) {
                if (A[i] == 0) {
                    endingIndex = i;
                    break;
                }
            }
            A[index] = 0;
            //left shift all the elements.
            for(int i = index; i < endingIndex; i++){
                A[i] = A[i + 1];
            }
        } else {
            System.out.println("The index is out of bounds.");
        }
        //set the element it's at to 0. basically "removing" it.

    }



}
