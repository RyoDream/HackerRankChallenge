package DataStructures.LinkedLists;

/**
 * Merge two sorted linked lists
 *
 * You’re given the pointer to the head nodes of two sorted linked lists.
 * The data in both lists will be sorted in ascending order.
 * Change the next pointers to obtain a single, merged linked list which also has data in ascending order.
 * Either head pointer given may be null meaning that the corresponding list is empty.
 *
 * Input Format
 * You have to complete the Node* MergeLists(Node* headA, Node* headB) method
 * which takes two arguments - the heads of the two sorted linked lists to merge.
 * You should NOT read any input from stdin/console.
 *
 * Output Format
 * Change the next pointer of individual nodes so that nodes from both lists are merged into a single list.
 * Then return the head of this merged list. Do NOT print anything to stdout/console.
 *
 * Sample Input
 * 1 -> 3 -> 5 -> 6 -> NULL
 * 2 -> 4 -> 7 -> NULL
 * 15 -> NULL
 * 12 -> NULL
 * NULL
 * 1 -> 2 -> NULL
 *
 * Sample Output
 * 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7
 * 12 -> 15 -> NULL
 * 1 -> 2 -> NULL
 *
 * Explanation
 * 1. We merge elements in both list in sorted order and output.
 */

public class MergeTwoSortedLinkedLists {
    class Node{
        int data;
        Node next;
    }

    /*
    Merge two linked lists
    head pointer input could be NULL as well for empty list
     */
    // O(n+m) space
    Node MergeLists(Node headA, Node headB) {
        Node newHead = new Node();
        Node tail = newHead;

        while(headA != null && headB != null) {
            Node newNode = new Node();
            if(headA.data < headB.data) {
                newNode.data = headA.data;
                headA = headA.next;
            }
            else {
                newNode.data = headB.data;
                headB = headB.next;
            }

            tail.next = newNode;
            tail = tail.next;

        }

        if(headA != null)
            tail.next = headA;
        else
            tail.next = headB;

        return newHead.next;
    }

    // in-place, O(1) space
    Node MergeLists2(Node headA, Node headB) {
        if(headA == null)
            return headB;
        if(headB == null)
            return headA;

        Node dummy = new Node();
        dummy.next = headA;
        Node prevA = dummy;

        while(headB != null && prevA.next != null) {
            if(prevA.next.data < headB.data)
                prevA = prevA.next;
            else {
                Node temp = headB;
                headB = headB.next;
                temp.next = prevA.next;
                prevA.next = temp;
                prevA = prevA.next;
            }
        }

        if(headB != null)
            prevA.next = headB;

        return dummy.next;

    }
}
