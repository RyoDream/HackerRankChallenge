package DataStructures.LinkedLists;

/**
 * Reverse a doubly linked list
 *
 * You’re given the pointer to the head node of a doubly linked list.
 * Reverse the order of the nodes in the list.
 * The head node might be NULL to indicate that the list is empty.
 *
 * Input Format
 * You have to complete the Node* Reverse(Node* head) method
 * which takes one argument - the head of the doubly linked list.
 * You should NOT read any input from stdin/console.
 *
 * Output Format
 * Change the next and prev pointers of all the nodes so that the direction of the list is reversed.
 * Then return the head node of the reversed list. Do NOT print anything to stdout/console.
 *
 * Sample Input
 * NULL
 * NULL <-- 2 <--> 4 <--> 6 --> NULL
 *
 * Sample Output
 * NULL
 * NULL <-- 6 <--> 4 <--> 2 --> NULL
 *
 * Explanation
 * 1. Empty list, so nothing to do.
 * 2. 2,4,6 become 6,4,2 o reversing in the given doubly linked list.
 */
public class ReverseADoublyLinkedList {
    class Node{
        int data;
        Node next;
        Node prev;
    }

    Node Reverse(Node head) {
        if(head == null || head.next == null)
            return head;

        Node newHead = new Node();
        while(head != null) {
            Node temp = head;
            head = head.next;

            if(newHead.next == null) {
                newHead.next = temp;
                temp.prev = newHead;
                temp.next = null;
            }
            else {
                temp.next = newHead.next;
                temp.prev = newHead;
                newHead.next.prev = temp;
                newHead.next = temp;
            }
        }

        return newHead.next;
    }

}
