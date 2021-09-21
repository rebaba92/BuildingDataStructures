package com.company;

public class BinarySearchTree {
    private class BSTNode{
        private BSTNode left;
        private BSTNode right;
        private int value;

        public BSTNode(int value){
            this.value = value;
        }

    }
    private BSTNode root;
    public void insert(int value){
        if(root == null){
            root = new BSTNode(value);;
            return;
        }
        BSTNode current = root;
        while(true){
            if(value < current.value){
                if(current.left == null){
                    current.left = new BSTNode(value);
                    break;
                }
                current = current.left;
            } else{
                if(current.right == null){
                    current.right = new BSTNode(value);
                    break;
                }
                current = current.right;
            }
        }
    }
    public boolean find(int value){
            var current = root;
            while(current != null){
                if(value < current.value){
                    current = current.left;
                }else if(value> current.value){
                    current = current.right;
                } else{
                    return true;
                }
            }
            return false;
    }
}
