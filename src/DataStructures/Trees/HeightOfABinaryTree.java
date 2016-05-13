package DataStructures.Trees;

/**
 * Tree: Height of a Binary Tree
 *
 * The height of a binary tree is the number of edges between the tree's root and its furthest leaf.
 * This means that a tree containing a single node has a height of .
 *
 * Complete the height function provided in your editor so that it returns the height of a binary tree.
 * This function has a parameter, , which is a pointer to the root node of a binary tree.
 *
 * Input Format
 * You do not need to read any input from stdin.
 * Our grader will pass the root node of a binary tree to your height function.
 *
 * Output Format
 * Your function should return a single integer denoting the height of the binary tree.
 *
 * Sample Input
 * BST.png
 *
 * Note: A binary search tree is a binary tree in which the value of each parent node's left child
 * is less than the value the parent node,
 * and the value of the parent node is less than the value of its right child.
 *
 * Sample Output
 * 3
 *
 * Explanation
 * The longest root-to-leaf path is shown below:
 * Longest RTL.png
 * There are  nodes in this path that are connected by  edges, meaning our binary tree's .
 * Thus, we print  as our answer.
 */
public class HeightOfABinaryTree {
    class Node{
        int data;
        Node left;
        Node right;
    }

    int height(Node root) {
        if(root == null)
            return 0;

        if(root.left == null && root.right == null)
            return 0;

        return Math.max(height(root.left), height(root.right)) + 1;
    }
}
