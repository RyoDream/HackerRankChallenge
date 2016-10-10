package CrackingTheCodeInterview;

/**
 * Linked Lists: Detect a Cycle
 *
 * A linked list is said to contain a cycle
 * if any node is visited more than once while traversing the list.
 *
 * Complete the function provided in the editor below.
 * It has one parameter: a pointer to a Node object named head
 * that points to the head of a linked list.
 *
 * Your function must return a boolean denoting
 * whether or not there is a cycle in the list.
 *
 * If there is a cycle, return true; otherwise, return false.
 */
public class LinkedList_DetectACycle {
    class Node {
        int data;
        Node next;
    }

    boolean hasCycle(Node head) {
        if(head == null || head.next == null)
            return false;

        Node walker = head;
        Node runner = head;

        while(runner != null && runner.next != null) {
            runner = runner.next.next;
            walker = walker.next;

            if(runner == walker)
                return true;
        }

        return false;
    }
}
