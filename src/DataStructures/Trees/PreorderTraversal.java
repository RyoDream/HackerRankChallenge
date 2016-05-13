package DataStructures.Trees;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * Tree: Preorder Traversal
 * Complete the preOrder function in your editor below,
 * which has  parameter: a pointer to the root of a binary tree.
 * It must print the values in the tree's preorder traversal as a single line of space-separated values.
 *
 * Input Format
 * Our hidden tester code passes the root node of a binary tree to your preOrder function.
 *
 * Output Format
 * Print the tree's preorder traversal as a single line of space-separated values.
 *
 * Sample Input
 * BTinput.png
 *
 * Sample Output
 * 3 5 1 4 2 6
 */
public class PreorderTraversal {
    class Node {
        int data;
        Node left;
        Node right;
    }

    void preOrder(Node root) {
        Deque<Node> stack = new ArrayDeque<>();
        Node p = root;

        while(!stack.isEmpty() || p != null ) {
            if(p != null) {
                stack.push(p);
                System.out.print(p.data+" ");
                p = p.left;
            }
            else {
                Node node = stack.pop();
                p = node.right;
            }
        }
        System.out.println();
    }


}
