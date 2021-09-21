package com.company;

import java.util.ArrayList;

public class Stack {
    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
        Node head;
        Node tail;
        int size = -1;

        public void push(int value){
            Node current = new Node(value);
            if(head == null){
                head = current;
                tail = current;
                size = 0;
            } else{
                current.next = head;
                head = current;
                size++;
            }
        }
        public int pop(){
            if(!isEmpty()) {
                int value = head.value;
                head = head.next;
                size--;
                return value;
            }else {
                System.out.println("Stack is Empty");
                return -1;
            }
        }
        public int peek(){
            return head.value;
        }
        public boolean isEmpty(){
            if(size == -1){
                return true;
            } else{
                return false;
            }
        }

    }




