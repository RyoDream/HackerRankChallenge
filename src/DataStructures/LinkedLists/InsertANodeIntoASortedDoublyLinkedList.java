package DataStructures.LinkedLists;

/**
 * Insert a node into a sorted doubly linked list
 *
 * You’re given the pointer to the head node of a sorted doubly linked list and an integer to insert into the list.
 * Create a node and insert it into the appropriate position in the list.
 * The head node might be NULL to indicate that the list is empty.
 *
 * Input Format
 * You have to complete the Node* SortedInsert(Node* head, int data) method
 * which takes two arguments - the head of the sorted, doubly linked list and the value to insert. You should NOT read any input from stdin/console.
 *
 * Output Format
 * Create a node with the given data and insert it into the given list,
 * making sure that the new list is also sorted. Then return the head node of the updated list.
 * Do NOT print anything to stdout/console.
 *
 * Sample Input
 * NULL , data = 2
 * NULL <-- 2 <--> 4 <--> 6 --> NULL , data = 5
 *
 * Sample Output
 * NULL <-- 2 --> NULL
 * NULL <-- 2 <--> 4 <--> 5 <--> 6 --> NULL
 *
 * Explanation
 * 1. We have an empty list, 2 is inserted.
 * 2. Data 5 is inserted such as list remains sorted.
 */
public class InsertANodeIntoASortedDoublyLinkedList {
    class Node{
        int data;
        Node next;
        Node prev;
    }

    // with dummy node
    Node SortedInsert(Node head, int data) {
        Node newNode = new Node();
        newNode.data = data;

        if(head == null)
            return newNode;

        Node dummy = new Node();
        dummy.next = head;
        head.prev = dummy;

        Node cur = dummy;
        while(cur.next != null && cur.next.data < data) {
            cur = cur.next;
        }

        if(cur.next != null) {
            newNode.next = cur.next;
            newNode.prev = cur;
            cur.next.prev = newNode;
            cur.next = newNode;
        }
        else {
            cur.next = newNode;
            newNode.prev = cur;
        }

        return dummy.next;
    }

    // without dummy node
    Node SortedInsert2(Node head, int data) {
        Node newNode = new Node();
        newNode.data = data;

        if(head == null)
            return newNode;

        Node cur = head;

        if(cur.data > data) {
            newNode.next = cur;
            cur.prev = newNode;
            head = newNode;
        }
        else {
            while(cur.next != null && cur.next.data < data)
                cur = cur.next;

            if(cur.next != null) {
                newNode.next = cur.next;
                newNode.prev = cur;
                cur.next.prev = newNode;
                cur.next = newNode;
            }
            else {
                cur.next = newNode;
                newNode.prev = cur;
            }
        }
        return head;
    }
}
