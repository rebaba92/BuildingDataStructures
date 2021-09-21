package com.company;

public class Queue {
    private int[] myQueue;
    private int myQueueSize;
    private int head ;
    private int tail;
    private int count;

    public Queue(int myQueueSize){
        this.myQueueSize = myQueueSize;
        myQueue = new int[myQueueSize];
        count= 0;
    }

    public void enqueue(int val) {
        if(count == myQueue.length){
            System.out.println("The queue is full");
            return;
        }
        myQueue[tail] = val;
        tail = (tail + 1) % myQueue.length;
        count++;

    }
    public int dequeue() {
        if (!isEmpty()) {
            int currentHead = myQueue[head];
            myQueue[head] = 0;
            head = (head + 1) % myQueue.length;
            count--;
            return currentHead;
        } else{
            System.out.println("Queue is empty");
            return -1;
        }
    }
    public int peek(){
        return myQueue[head];
    }
    public boolean isEmpty(){
        return tail == -1;
    }
    public boolean isFull(){
        return tail == myQueueSize - 1;
    }
    public void viewQueue(){
        for(int i = 0; i < myQueueSize; i++){
            System.out.print(myQueue[i] + " , ");
        }
    }

}