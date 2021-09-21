package com.company;

import java.util.LinkedList;

public class HashTable {
    private class Entry{
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }


    private LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(int key, String value){
        int index = hash(key);
        //creating a new linkedlist if there does not exist one already at this index.
        if(entries[index] == null) {
            entries[index] = new LinkedList<>();
        }
        //end creating new linkedlist

        //get the bucket at this specific index
        LinkedList<Entry> bucket = entries[index];
        //at the specific LL bucket now, and checking to see if there is a key in the bucket that matches our key.
        for(Entry entry : bucket) {
            if (entry.key == key) {
                entry.value = value; //update the value of key.
                return; //return because we do not want to add new entry at the end of this bucket.
            }
        }
         bucket.addLast(new Entry(key,value));
        }

    private int hash(int key){
        return key % entries.length;
    }

    public String get(int key){
        var index = hash(key);
        //getting out bucket to iterate over and find a matching key, then return its value
        var bucket = entries[index];
        if(bucket!=null) {
            for (Entry entry : bucket) {
                if (entry.key == key) {
                    return entry.value;
                }
            }
        }
        return null;
    }

    public void remove(int key){
        var index = hash(key);
        LinkedList<Entry> bucket = entries[index];
        if(bucket == null){
            throw new IllegalStateException();
        }
        for(Entry entry : bucket){
            if(entry.key == key){
                bucket.remove(entry);
                return;
            }
        }
        throw new IllegalStateException();
    }

}
