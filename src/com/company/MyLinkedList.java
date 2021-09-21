package com.company;

public class MyLinkedList {
    //implementation detail
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

    }
    private Node first;
    private Node last;
    private int size;

    public void addLast(int item) {
        Node node = new Node(item);
        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst(int item) {
        Node node = new Node(item);
        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public boolean isEmpty() {
        if (first == null) {
            return true;
        }
        return false;
    }

    public int indexOf(int item) {
        int index = 0;
        Node current = first;
        while (current != null) {
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        if (!isEmpty()) {
            Node temp = first.next;
            first.next = null;
            first = temp;
        }
        if (first == last) {
            first = null;
            last = null;
        }
        size--;
    }

    public void removeLast() {
        Node current = first;
        if(first == last){
            first = null;
            last = null;
            size--;
        }
        if(!isEmpty()) {
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
            last = current;
            size--;
        }
//        if (first == last) {
//            first = null;
//            last = null;
//        } else {
//            last = getPrevious(last);
//            assert last != null;
//            last.next = null;
//        }
    }

    private Node getPrevious(Node node) {
        Node current = first;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }
    //get the node at the current index
    public Node get(int item){
        int index = 0;
        Node current = first;
        while (current != null) {
            if (current.value == item) return current;
            current = current.next;
            index++;
        }
        return null;
    }

    public void insertAfter(int item, int value){
        Node newNode = new Node(value);
        Node temp = first;
        if(first == last){
            first.next = newNode;
            last = newNode;
            size++;
            return;
        }
        if(!isEmpty()) {
            while (temp != null) {
                if (temp.value == item) {
                    newNode.next = temp.next;
                    temp.next = newNode;
                    size++;
                }
                temp = temp.next;
            }
        }

//        if(!isEmpty()) {
//            Node previous = get(item);
//            Node temp = previous.next;
//            previous.next = current;
//            current.next = temp;
//            size++;
//        }

    }

    public int size() {
        return size;
    }

    public void reverse(){
        if(isEmpty()){
            return;
        }
        Node  prev = first;
        Node current = first.next;
        while(current != null){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        last = first;
        last.next = null;
        first =  prev;
    }

    public int kthNodeFromEnd(int k){
        if(k > size){
            return -1;
        }
        Node slow = first;
        Node fast = first;
        for(int i = 0; i < k-1; i++){
            fast=fast.next;
            //if we don't know the size of our linked list
            if(fast == null){
                throw new IllegalArgumentException();
            }
        }
        while(fast != last){
            fast = fast.next;
            slow = slow.next;
        }
        return slow.value;
    }




}
