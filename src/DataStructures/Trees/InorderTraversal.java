package DataStructures.Trees;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Tree: Inorder Traversal
 *
 * Complete the inOrder function in your editor below,
 * which has  parameter: a pointer to the root of a binary tree.
 *
 * It must print the values in the tree's preorder traversal as a single line of space-separated values.
 *
 * Input Format
 * Our hidden tester code passes the root node of a binary tree to your inOrder function.
 *
 * Output Format
 * Print the tree's inorder traversal as a single line of space-separated values.
 *
 * Sample Input
 * BTinput.png
 *
 * Sample Output
 * 1 5 4 3 6 2
 */
public class InorderTraversal {
    class Node {
        int data;
        Node left;
        Node right;
    }

    void inOrder(Node root) {
        Deque<Node> stack = new ArrayDeque<>();
        Node p = root;

        while( !stack.isEmpty() || p!=null) {
            if(p != null) {
                stack.push(p);
                p = p.left;
            }
            else {
                Node node = stack.pop();
                System.out.print(node.data+" ");
                p = node.right;
            }
        }

        System.out.println();
    }
}
