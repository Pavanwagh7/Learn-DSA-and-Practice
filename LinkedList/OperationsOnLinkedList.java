package LinkedList;

public class OperationsOnLinkedList {
    public void deleteANode () {

    }
    public boolean isTargetPresent (Node head,int target) {
        Node ptr = head;
        while (ptr != null){
            if (ptr.value == target) return true;
            ptr = ptr.next;
        }
        return false;
    }
    public int valueAtKthNode (Node head,int k) {
        /** It can be done using Recursion as a well */
        /**

        // base case
        if (k == 0) return head.value;
        // return statment - Recursion here
        return valueAtKthNode(head.nextNode,k-1);    */

        // using Loop
        Node ptr = head;
        for (int i = 0;i < k;i++) {
            ptr = ptr.next;
        }
        return ptr.value;
    }
    public void printingManually (Node head) {
        System.out.println(head.value);
        System.out.println(head.next.value);
        System.out.println(head.next.next.value);
        System.out.println(head.next.next.next.value);
        System.out.println(head.next.next.next.next.value);
        System.out.println(head.next.next.next.next.next.value);
        System.out.println(head.next.next.next.next.next.next.value);
    }
    public void printUsingLoops (Node head) {
        Node ptr = head;
        while (ptr != null){
            System.out.println(ptr.value);
            ptr = ptr.next;
        }
        // or
        /**
         ptr = fN;
         for (int i = 0; i < data.length; i++) {
             System.out.println(ptr.value);
             ptr = ptr.nextNode;
         }                                        */
    }
}
