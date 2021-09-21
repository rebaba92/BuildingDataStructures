package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //create the array.
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(4);
        binarySearchTree.insert(3);
        binarySearchTree.insert(8);
        System.out.println(binarySearchTree.find(4));

    }
}
