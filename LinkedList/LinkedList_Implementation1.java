package LinkedList;

class Node {
    int value;
    Node next;
}

public class LinkedList_Implementation1 {

    public Node Implementation() {
        Node fN = new Node ();
        Node next = fN;
        int[] data = new int[]{12,-1,0,4,67,4,8};
        for (int i = 0;i < data.length;i++) {
            if (i == data.length - 1){
                next.next = null;
                next.value = data[i];
                break;
            }
            else next.next = new Node();
            next.value = data[i];
            next = next.next;
        }

        return fN;
    }

}

