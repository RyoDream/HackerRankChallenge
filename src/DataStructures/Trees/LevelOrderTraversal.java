package DataStructures.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Tree: Level Order Traversal
 *
 * You are given a pointer to the root of a binary tree.
 * You need to print the level order traversal of this tree.
 * In level order traversal, we visit the nodes level by level from left to right.
 *
 * You only have to complete the function.
 *
 * For example:
 *      3
 *    /   \
 *   5     2
 *  / \    /
 * 1   4  6
 *
 * For the above tree, the level order traversal is 3 -> 5 -> 2 -> 1 -> 4 -> 6.
 *
 * Input Format
 * You are given a function,
 *
 * void level_order(node * root)
 * {
 *
 * }
 *
 * Output Format
 * Print the values in a single line seperated by a space.
 *
 * Sample Input
 *      3
 *    /   \
 *   5     2
 *  / \    /
 * 1   4  6
 *
 * Sample Output
 * 3 5 2 1 4 6
 *
 * Explanation
 * Level 1:        3
 *               /   \
 * Level 2:     5     2
 *             / \    /
 * Level 3:   1   4  6
 *
 * We need to print the nodes level by level. We process each level from left to right.
 * Level Order Traversal: 3 -> 5 -> 2 -> 1 -> 4 -> 6
 */
public class LevelOrderTraversal {
    class Node {
        int data;
        Node left;
        Node right;
    }

    void LevelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        String res = "";
        if(root == null)
            return;

        queue.add(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            while(size-- > 0) {
                Node temp = queue.poll();
                res = res + temp.data + " ";

                if(temp.left != null)
                    queue.add(temp.left);
                if(temp.right != null)
                    queue.add(temp.right);
            }
        }

        System.out.println(res);
    }
}
