package Trees;

import java.util.Scanner;

/* BST : Binary Search Tree*/
public class BST {
    static class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        // Constructor
        public Node (int value) {
            this.value = value;
        }

        // Getters
        int getvalue () {return this.value;}

        // Setters
        void setvalue (int value) { this.value = value;}
       
    }

    private Node root;

    public BST () {}

    public boolean isEmpty () { return root == null; }
    public int height (Node node) { if (node != null) return node.height; return -1; }

    public void insert (Scanner sc) {
        
    }
    private Node insert (int value, Node node) {
        //Base case
        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (value < node.value) {
            node.left = insert(value, node.left);
        }

        if (value > node.value) {
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }
}
