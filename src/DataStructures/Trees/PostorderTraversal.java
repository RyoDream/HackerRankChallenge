package DataStructures.Trees;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Tree: Postorder Traversal
 * Complete the postOrder function in your editor below,
 * which has  parameter: a pointer to the root of a binary tree.
 * It must print the values in the tree's preorder traversal as a single line of space-separated values.
 *
 * Input Format
 * Our hidden tester code passes the root node of a binary tree to your postOrder function.
 *
 * Output Format
 * Print the tree's postorder traversal as a single line of space-separated values.
 *
 * Sample Input
 * BTinput.png
 *
 * Sample Output
 * 1 4 5 6 2 3
 */
public class PostorderTraversal {
    class Node{
        int data;
        Node left;
        Node right;
    }

    void postOrder(Node root) {
        String res = "";
        Deque<Node> stack = new ArrayDeque<>();

        Node p = root;

        while(!stack.isEmpty() || p!=null) {
            if(p!=null) {
                stack.push(p);
                res = p.data +" "+res;
                p = p.right;
            }
            else {
                Node node = stack.pop();
                p = node.left;
            }
        }
        System.out.println(res);

    }
}
