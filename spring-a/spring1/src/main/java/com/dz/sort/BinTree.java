package com.dz.sort;

/**
 * @auther D Z
 * @date 2020/3/12 15:31
 */
public class BinTree {
    public static void main(String[] args) {

    }


    private class Node{
        private  int data;
        private  Node root;
        private  Node left;
        private Node right;


        public void add(Node newNode){
            if (this.root==null){
                this.root = newNode;
            }else{
                this.root.addNode(newNode);
            }
        }
        public  void addNode(Node node){
            
        }
    }
}
