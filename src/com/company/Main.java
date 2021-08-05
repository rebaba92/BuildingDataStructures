package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //create the array.
        System.out.println("Test Commit and Push");
        Array array = new Array();
        array.display(array.A);
        System.out.println("///////");
        array.add(10);
        array.display(array.A);
        array.delete(0);
        System.out.println("-------------");
        array.display(array.A);
        array.add(5);
        array.add(5);
        array.add(10);
        array.display(array.A);
        array.delete(10);
        System.out.println("//////////");
        array.display(array.A);
        array.add(11);
        array.display(array.A);

    }
}
