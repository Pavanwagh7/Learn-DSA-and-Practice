package Trees;
import java.util.Scanner;

class Node {
    int value;
    Node right;
    Node left;
    int level;

    // Constructors
    public Node () {}
    public Node (int value) {
        this.value = value;
    }
}
class BinaryTree {
    Node root;

    // Getter
    public Node getRoot () { return this.root;}

    // Constructor
    public BinaryTree () {};

    public void insert (Scanner sc) {
       System.out.print("Enter the root Node value : ");
       int value = sc.nextInt ();
       root = new Node(value); // Root Node created
       insert(sc, root);
    }
    public void insert (Scanner sc,Node node) {
        // Insert Left Node
        System.out.print("Do you want to insert in the left of " + node.value + " (true/false) :- ");
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.print("Enter the value to the left of " + node.value + " :- ");
            int value = sc.nextInt();
            node.left = new Node(value);
            insert(sc, node.left);
        }

        // Insert Right Node
        System.out.print("Do you want to insert in the right of the " + node.value + " (ture/false) :- ");
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.print("Enter the value in the right of " + node.value + " :- ");
            int value = sc.nextInt();
            node.right = new Node(value);
            insert(sc, node.right);
        }
    } 

    public void print (Node node) {
        // Base case
        if (node == null){
            return;
        }
        // Visit left Node 
        System.out.println(node.value);
        print(node.left);
            
        // Visit right Node
        if (node == null){
            return;
        }
        System.out.println(node.value);
        print(node.right);

    }
}

public class Basics {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        BinaryTree bt = new BinaryTree();
        bt.insert(sc);

        Node root = bt.getRoot();
        
        // Print the tree;
        bt.print(root);
        
        sc.close();
    }
}