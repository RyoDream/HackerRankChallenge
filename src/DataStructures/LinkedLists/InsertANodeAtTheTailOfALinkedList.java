package DataStructures.LinkedLists;

/**
 * Insert a Node at the Tail of a Linked List
 *
 * You are given the pointer to the head node of a linked list and an integer to add to the list.
 * Create a new node with the given integer.
 * Insert this node at the tail of the linked list and return the head node.
 * The given head pointer may be null, meaning that the initial list is empty.
 *
 * Input Format
 * You have to complete the Node* Insert(Node* head, int data) method.
 * It takes two arguments: the head of the linked list and the integer to insert.
 * You should not read any input from the stdin/console.
 *
 * Output Format
 * Insert the new node at the tail and just return the head of the updated linked list.
 * Do not print anything to stdout/console.
 *
 * Sample Input
 * NULL, data = 2
 * 2--> NULL, data = 3
 *
 *
 * Sample Output
 * 2 -->NULL
 * 2 --> 3 --> NULL
 *
 * Explanation
 * 1. We have an empty list, and we insert .
 * 2. We start with a  in the tail. When  is inserted,  then becomes the tail.
 */
public class InsertANodeAtTheTailOfALinkedList {
    /*
    Insert Node at the end of a linked list
    head pointer input could be NULL as well for empty list
    */

    class Node {
        int data;
        Node next;
    }

    Node Insert(Node head, int data) {
        Node newNode = new Node();
        newNode.data = data;

        if(head == null)
            return newNode;

        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }

        cur.next = newNode;
        return head;
    }
}
