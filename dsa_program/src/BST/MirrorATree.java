package BST;

import java.util.*;


class NodeThree {
    int data;
    Node left, right;

    NodeThree(int value) {
        data = value;
        left = right = null;
    }
}

class TreeTwo {
    Node root;

    TreeTwo() {
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

    // Method to print the tree in pre-order traversal
    void preOrderDFS(Node node) {
        if (node == null)
            return;

        // visit the parent node (parent of left & right children)
        System.out.print(node.data + " ");
        // recursively go to left subtree
        preOrderDFS(node.left);
        // recursively go to right subtree
        preOrderDFS(node.right);
    }

    // Method to convert a given binary tree into its mirror image
    public void mirror(Node node) {
        // Write your code here
        if (root == null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        // Do BFS. While doing BFS, keep swapping
        // left and right children
        while (q.size() > 0)
        {
            // pop top node from queue
            Node curr = q.peek();
            q.remove();

            // swap left child with right child
            Node temp = curr.left;
            curr.left = curr.right;
            curr.right = temp;

            // push left and right children
            if (curr.left != null)
                q.add(curr.left);
            if (curr.right != null)
                q.add(curr.right);
        }
    }
}

public class MirrorATree {

    public static void main(String[] x) {
        TreeTwo tree = new TreeTwo();

        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        if(size <= 0){
            System.out.println("Size should be a positive integer");
        }

        else{
            int[] elementsArr = new int[size];
            for(int i = 0; i < size; i++) {
                elementsArr[i] = sc.nextInt();
            }

            tree.root = tree.insertNode(elementsArr, tree.root, 0);

            tree.mirror(tree.root);

            tree.preOrderDFS(tree.root);
        }
    }

}
/*
Mirror a Tree
Description
Consider the binary tree given below. You are required to convert it into its mirror image.



Image 5-01.jpg 97.24 KB

﻿The mirror image of this binary tree will be:﻿

Image 2-01.jpg 96.56 KB

﻿Input:

The input will be in the following format:

The first line should be the number ‘n’. Here, the number ‘n’ is the total number of nodes present in the binary tree.
The second line contains space-separated ‘n’ values. No value should be equal to -1. This is the level-order traversal of the tree. The code for inserting the values in the tree for the given level order traversal has been addressed in the code.


Output:

The output should be the pre-order traversal of the mirror tree with the nodes separated by spaces. The code for pre-order traversal of a tree has been provided to you in the stub code. You only need to complete the code for mirroring a tree.





Sample Input:

5

1 2 3 4 5

Sample Output:

1 3 2 5 4



Sample Input:

6

6 9 8 7 4 5

Sample Output:

6 8 5 9 4 7
 */
