package BST;

public class DepthofNode {
    static int height = -1;

    // Structure of a Binary Tree Node
    static class Node
    {
        int data;
        Node left;
        Node right;
    };

    // Utility function to create
// a new Binary Tree Node
    static Node newNode(int item)
    {
        Node temp = new Node();
        temp.data = item;
        temp.left = temp.right = null;
        return temp;
    }

    // Function to find the depth of
// a given node in a Binary Tree
    static int findDepth(Node root, int x)
    {

        // Base case
        if (root == null)
            return -1;

        // Initialize distance as -1
        int dist = -1;

        // Check if x is current node=
        if ((root.data == x)||

                // Otherwise, check if x is
                // present in the left subtree
                (dist = findDepth(root.left, x)) >= 0 ||

                // Otherwise, check if x is
                // present in the right subtree
                (dist = findDepth(root.right, x)) >= 0)

            // Return depth of the node
            return dist + 1;

        return dist;
    }

    // Helper function to find the height
// of a given node in the binary tree
    static int findHeightUtil(Node root, int x)
    {

        // Base Case
        if (root == null)
        {
            return -1;
        }

        // Store the maximum height of
        // the left and right subtree
        int leftHeight = findHeightUtil(root.left, x);

        int rightHeight = findHeightUtil(root.right, x);

        // Update height of the current node
        int ans = Math.max(leftHeight, rightHeight) + 1;

        // If current node is the required node
        if (root.data == x)
            height = ans;

        return ans;
    }

    // Function to find the height of
// a given node in a Binary Tree
    static int findHeight(Node root, int x)
    {

        // Stores height of the Tree
        findHeightUtil(root, x);

        // Return the height
        return height;
    }

    // Driver Code
    public static void main(String []args)
    {
        // Binary Tree Formation
        Node root = newNode(43);
        root.left = newNode(1);
        root.right = newNode(38);
        root.left.left = newNode(54);
        root.left.right = newNode(75);
        root.left.right.right = newNode(29);
        root.right.left = newNode(6);
        root.right.right = newNode(44);

        int k = 29;

        // Function call to find the
        // depth of a given node
        System.out.println("Depth: " + findDepth(root, k));

        // Function call to find the
        // height of a given node
        System.out.println("Height: " + findHeight(root, k));
    }
}
