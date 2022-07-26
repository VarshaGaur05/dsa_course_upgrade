package BST;
import java.util.*;

class NodeSix {
    int data;
    Node left, right;

    NodeSix(int value) {
        data = value;
        left = right = null;
    }
}

class BinaryTreeOne {
    Node root;

    BinaryTreeOne() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    // A recursive function to insert a new key in BST
    Node insertRec(Node root, int key) {

        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.data)
            root.left = insertRec(root.left, key);
        else if (key > root.data)
            root.right = insertRec(root.right, key);

        return root;
    }

    //Function to print nodes that dont have a sibling
    void printSingles(Node node) {
        // complete this function
        // Base case
        if (node == null)
            return;

        // If this is an internal node, recur for left
        // and right subtrees
        if (node.left != null && node.right != null)
        {
            printSingles(node.left);
            printSingles(node.right);
        }

        // If left child is NULL and right
        // is not, print right child
        // and recur for right child
        else if (node.right != null)
        {
            System.out.print(node.right.data + " ");
            printSingles(node.right);
        }

        // If right child is NULL and left
        // is not, print left child
        // and recur for left child
        else if (node.left != null)
        {
            System.out.print( node.left.data + " ");
            printSingles(node.left);
        }
    }
}

// WARNING: Do not edit code below this; failing which your solution may not pass the test case(s)

public class NodesThatDoNotHaveSibling {
    public static void main(String args[]) {
        BinaryTreeOne tree = new BinaryTreeOne();

        Scanner sc = new Scanner(System.in);
        int size;
        size = sc.nextInt();

        if(size<= 0){
            System.out.println("Size should be a positive integer");
        }

        else{
            int[] elementsArr = new int[size];
            for(int i = 0; i < size; i++){
                elementsArr[i] = sc.nextInt();
                tree.insert(elementsArr[i]);
            }
            tree.printSingles(tree.root);
        }
    }
}

/*
Nodes that do not have sibling
Description
A sibling is a node that has the same parent. In a binary search tree, there can be at the most one sibling. Print all such nodes in a single line that do not have a sibling.﻿﻿﻿

Image 6-01.jpg 104.88 KB

﻿Input: The input will be in the following format:

The first line will be ‘n’, which represents the number of elements to be inserted into the BST.
The next line will be n elements separated by spaces, which represents the elements to be inserted into the BST.


Output: The output should be in the following format:

The values of all the nodes separated by spaces in a single line that do not have a sibling in the BST [first, the nodes of the left subtree (level wise from the top) are printed, followed by the ones in the right subtree in the same format].


Sample Input:

6

5 2 8 1 4 3

Sample Output:

3



Sample Input:

7

22 1 45 27 19 41 3

Sample Output:

19 3 27 41



Note that the root node should not be printed because there is no parent of the root node to determine whether it is a sibling or not.
 */
