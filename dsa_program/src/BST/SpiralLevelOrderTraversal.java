package BST;
import java.util.*;

class NodeFour {
    int data;
    NodeFour left, right;

    NodeFour(int value) {
        data = value;
        left = right = null;
    }
}

class TreeThree {
    Node root;

    TreeThree() {
        root = null;
    }

    // Method to construct a binary tree from the given array
    public Node insertNode(int[] elementsArr, Node node, int i) {
        if(i < elementsArr.length){
            node = new Node(elementsArr[i]);
            node.left = insertNode(elementsArr,node.left,2 * i + 1);
            node.right = insertNode(elementsArr,node.right,2 * i + 2);
        }
        return node;
    }

    // Method to traverse the elements of a tree using BFS (level-order traversal) in the spiral order
    void spiralOrder(Node node) {
        // Write your code here
        int h = height(node);
        int i;

        /* ltr -> left to right. If this variable is set then the
           given label is traversed from left to right */
        boolean ltr = false;
        for (i = 1; i <= h; i++) {
            printGivenLevel(node, i, ltr);

            /*Revert ltr to traverse next level in opposite order*/
            ltr = !ltr;
        }
    }
    /* Compute the "height" of a tree -- the number of
    nodes along the longest path from the root node
    down to the farthest leaf node.*/
    int height(Node node) {
        if (node == null)
            return 0;
        else {

            /* compute the height of each subtree */
            int lheight = height(node.left);
            int rheight = height(node.right);

            /* use the larger one */
            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }
    /* Print nodes at a given level */
    void printGivenLevel(Node node, int level, boolean ltr) {
        if (node == null)
            return;
        if (level == 1)
            System.out.print(node.data + " ");
        else if (level > 1) {
            if (ltr != false) {
                printGivenLevel(node.left, level - 1, ltr);
                printGivenLevel(node.right, level - 1, ltr);
            } else {
                printGivenLevel(node.right, level - 1, ltr);
                printGivenLevel(node.left, level - 1, ltr);
            }
        }
    }
}


public class SpiralLevelOrderTraversal {
    public static void main(String[] x) {
        TreeThree tree = new TreeThree();

        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        if (size < 0){
            System.out.println("Size should be a positive integer");
        }

        else{
            int[] elementsArr = new int[size];
            for(int i = 0; i < size; i++) {
                elementsArr[i] = sc.nextInt();
            }

            tree.root = tree.insertNode(elementsArr, tree.root, 0);

            tree.spiralOrder(tree.root);
        }
    }
}

/*
Spiral Level-Order Traversal
Description
Consider the binary tree given below. You are required to print the spiral level-order traversal for it.

Image 5-01.jpg 97.24 KB

﻿Output:

1 2 3 5 4



Input:

The input will be in the following format:

The first line should be the number ‘n’. Here, the number ‘n’ is the total number of nodes present in the binary tree.
The second line contains space-separated ‘n’ values. This is the level-order traversal of the tree. The code for inserting the values in the tree for the given level-order traversal has been addressed in the code.


Output:

The output should be the spiral level-order traversal of the tree with the nodes separated by spaces.



Sample Input:

5

1 2 3 4 5

Sample Output:

1 2 3 5 4



Sample Input:

4

8 2 5 6

Sample Output:

8 2 5 6
 */
