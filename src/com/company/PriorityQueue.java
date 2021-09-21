package com.company;

public class PriorityQueue {
    private int[] myPQ;
    private int myPQSize;
    private int count;
    private int head;
    private int tail;

    public PriorityQueue(int maxSize){
        this.myPQSize = maxSize;
        myPQ = new int[myPQSize];
        count = 0;
    }

    public void enqueue(int item){
        //codition for if it's full.
        //we need to loop through the queue from the back before we insert
        for(int i = tail; i > 0; i--){
            if(item < myPQ[i]){
                myPQ[tail] = myPQ[tail];
            }
        }





    }





}
