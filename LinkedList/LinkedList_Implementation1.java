package LinkedList;

class Node {
    int value;
    Node nextNode;
}

public class LinkedList_Implementation1 {
    int valueAtKthNode (Node head,int k) {
        Node next = head;
        for (int i = 1;i < k;i++) {
            next = next.nextNode;
        }
        return next.value;
    }
    public static void main(String[] args) {
        Node fN = new Node ();
        Node next = fN;
        int[] data = new int[]{12,-1,0,4,67,4,8};
        for (int i = 0;i < data.length;i++) {
            if (i == data.length - 1){
                next.nextNode = null;
                next.value = data[i];
                break;
            }
            else next.nextNode = new Node();
            next.value = data[i];
            next = next.nextNode;
        }
        next = fN;
        while (next != null){
            System.out.println(next.value);
            next = next.nextNode;
        }

        LinkedList_Implementation1 l = new LinkedList_Implementation1();
        System.out.println();
        System.out.println(l.valueAtKthNode(fN,1));

//        for (int i = 0; i < data.length; i++) {
//            System.out.println(next.value);
//            next = next.nextNode;
//        }
//        System.out.println(fN.value);
//        System.out.println(fN.nextNode.value);
//        System.out.println(fN.nextNode.nextNode.value);
//        System.out.println(fN.nextNode.nextNode.nextNode.value);
//        System.out.println(fN.nextNode.nextNode.nextNode.nextNode.value);
//        System.out.println(fN.nextNode.nextNode.nextNode.nextNode.nextNode.value);
//        System.out.println(fN.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode.value);
//        System.out.println(fN.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode.value);
//        System.out.println(fN.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode.value);
    }
}

