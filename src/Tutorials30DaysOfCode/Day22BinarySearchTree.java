package Tutorials30DaysOfCode;

import java.util.Scanner;

/**
 * Day 22: Binary Search Trees
 *
 * Objective
 * Today, we're working with Binary Search Trees (BSTs).
 * Check out the Tutorial tab for learning materials and an instructional video!
 *
 * Task
 * The height of a binary search tree is the number of edges between the tree's root and its furthest leaf.
 * You are given a pointer, root, pointing to the root of a binary search tree.
 * Complete the getHeight function provided in your editor so that it returns the height of the binary search tree.
 *
 * Input Format
 * The locked stub code in your editor reads the following inputs and assembles them into a binary search tree:
 * The first line contains an integer, n, denoting the number of nodes in the tree.
 * Each of the  subsequent lines contains an integer, n,
 * denoting the value of an element that must be added to the BST.
 *
 * Output Format
 * The locked stub code in your editor will print the integer
 * returned by your getHeight function denoting the height of the BST.
 *
 * Sample Input
 * 7
 * 3
 * 5
 * 2
 * 1
 * 4
 * 6
 * 7
 * Sample Output
 * 3
 */




public class Day22BinarySearchTree {

    public Node insert(Node root,int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public int getHeight(Node root) {
        if(root == null)
            return -1;

        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;

        Day22BinarySearchTree bst = new Day22BinarySearchTree();

        while(T-->0){
            int data=sc.nextInt();
            root=bst.insert(root,data);
        }
        int height=bst.getHeight(root);
        System.out.println(height);
    }

    class Node{
        Node left,right;
        int data;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
}
