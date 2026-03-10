package LinkedList;

public class QuestionsRelatedToDelete_a_Node {
    /** Que.1 if target is present and assume target can exist in any Node of LL(LinkedList)
    except last Node */
    public void deleteNextNodeIftargetPresent (Node head,int target) {
        Node ptr = head;
        while (ptr != null) {
            if (ptr.value == target) ptr.next = ptr.next.next;
            ptr = ptr.next;
        }
    }
    /** Que. 1.5  if target is present and assume target can exist in any Node of LL(LinkedList)
     ,even at the last Node of LL */
    public void deleteNextNodeIftargetPresent_Safe (Node head,int target) {
        Node ptr = head;
        while (ptr != null) {
            if (ptr.value == target && ptr.next != null) ptr.next = ptr.next.next;
            ptr = ptr.next;
        }
    }
    /** Que. 2 Given that the target exists in the linked list and is not in the first node,
     return the value of the node preceding the target node. */
    public int getPreviousValueOfTarget (Node head, int target) {
        Node ptr = head.next;
        Node previous = head;
        while (ptr != null) {
            if (ptr.value == target) return previous.value;
            previous = ptr;
            ptr = ptr.next;
        }
        return -1;//Target not found
    }
/** Que. 2.5 */
    public void deleteNodeIfTargetExistsInNode (Node head, int target) {
        Node ptr = head.next;
        Node previous = head;
        while (ptr != null) {
            if (ptr.value == target) {
                previous.next = ptr.next;
                return;
            }
            previous = ptr;
            ptr = ptr.next;
        }
    }
}