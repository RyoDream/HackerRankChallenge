package CrackingTheCodeInterview;

import java.util.ArrayList;
import java.util.List;

/**
 * Trees: Is This a Binary Search Tree?
 *
 * Complete the function in your editor below,
 * which has 1 parameter: a pointer to the root of a binary tree.
 *
 * It must return a boolean denoting whether or not the binary tree is a binary search tree.
 * You may have to write one or more helper functions to complete this challenge.
 *
 * Note: A binary tree is not a binary search if there are duplicate values.
 */
public class Trees_IsThisABinarySearchTree {
    class Node {
        int data;
        Node left;
        Node right;
    }

    boolean checkBST(Node root) {
        if(root == null)
            return true;
        List<Integer> numbers = new ArrayList<>();
        inOrderTraversal(root, numbers);

        for(int i=0;i<numbers.size()-1;i++) {
            if(numbers.get(i) >= numbers.get(i+1))
                return false;
        }

        return true;
    }

    void inOrderTraversal(Node node, List numbers) {
        if(node.left != null)
            inOrderTraversal(node.left, numbers);

        numbers.add(node.data);

        if(node.right != null)
            inOrderTraversal(node.right, numbers);
    }
}
