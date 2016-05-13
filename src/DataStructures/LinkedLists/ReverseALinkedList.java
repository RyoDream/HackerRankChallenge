package DataStructures.LinkedLists;

/**
 * Reverse a linked list
 *
 * You’re given the pointer to the head node of a linked list.
 * Change the next pointers of the nodes so that their order is reversed.
 * The head pointer given may be null meaning that the initial list is empty.
 *
 * Input Format
 * You have to complete the Node* Reverse(Node* head) method which takes one argument - the head of the linked list.
 * You should NOT read any input from stdin/console.
 *
 * Output Format
 * Change the next pointers of the nodes that their order is reversed and return the head of the reversed linked list.
 * Do NOT print anything to stdout/console.
 *
 * Sample Input
 * NULL
 * 2 --> 3 --> NULL
 *
 * Sample Output
 * NULL
 * 3 --> 2 --> NULL
 *
 * Explanation
 * 1. Empty list remains empty
 * 2. List is reversed from 2,3 to 3,2
 */


public class ReverseALinkedList {
    /*
    Reverse a linked list and return pointer to the head
    The input list will have at least one element
    */

    class Node{
        int data;
        Node next;
    }

    Node Reverse(Node head) {
        if(head == null)
            return null;

        Node newHead = null;
        while(head != null) {
            Node temp = head;
            head = head.next;

            if(newHead == null) {
                newHead = temp;
                temp.next = null;
            }
            else {
                temp.next = newHead;
                newHead = temp;
            }
        }

        return newHead;
    }

    Node Reverse2(Node head) {
        if(head == null || head.next == null)
            return head;

        Node newHead = null;
        Node cur = head.next;

        while(cur != null) {
            head.next = cur.next;
            if(newHead == null) {
                newHead = cur;
                newHead.next = head;
            }
            else {
                cur.next = newHead;
                newHead = cur;
            }
            cur = head.next;
        }

        return newHead;
    }
}
