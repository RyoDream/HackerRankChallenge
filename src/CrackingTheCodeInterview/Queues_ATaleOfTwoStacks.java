package CrackingTheCodeInterview;

import java.util.Scanner;
import java.util.Stack;

/**
 * Queues: A Tale of Two Stacks
 *
 * In this challenge, you must first implement a queue using two stacks.
 * Then process q queries, where each query is one of the following 3 types:
 * 1 x: Enqueue element  into the end of the queue.
 * 2: Dequeue the element at the front of the queue.
 * 3: Print the element at the front of the queue.
 */
public class Queues_ATaleOfTwoStacks {
    public static class MyQueue<T> {
        Stack<T> stackNewestOnTop = new Stack<T>();
        Stack<T> stackOldestOnTop = new Stack<T>();

        public void enqueue(T value) { // Push onto newest stack
            stackOldestOnTop.push(value);
        }

        public T peek() {
            if(stackNewestOnTop.isEmpty()) {
                while (!stackOldestOnTop.isEmpty()) {
                    stackNewestOnTop.push(stackOldestOnTop.pop());
                }
            }

            T front = stackNewestOnTop.pop();
            stackNewestOnTop.push(front);
            return front;
        }

        public T dequeue() {
            if(stackNewestOnTop.isEmpty()) {
                while (!stackOldestOnTop.isEmpty()) {
                    stackNewestOnTop.push(stackOldestOnTop.pop());
                }
            }

            return stackNewestOnTop.pop();
        }
    }


    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}
