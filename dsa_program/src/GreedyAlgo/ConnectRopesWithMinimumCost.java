package GreedyAlgo;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ConnectRopesWithMinimumCost {

    int[] harr; // Array of elements in heap
    int heap_size; // Current number of elements in min heap
    int capacity; // maximum possible size of min heap

    // Constructor: Builds a heap from
    // a given array a[] of given size
    public ConnectRopesWithMinimumCost(int a[], int size)
    {
        heap_size = size;
        capacity = size;
        harr = a;
        int i = (heap_size - 1) / 2;
        while (i >= 0) {
            MinHeapify(i);
            i--;
        }
    }

    // A recursive method to heapify a subtree
    // with the root at given index
    // This method assumes that the subtrees
    // are already heapified
    void MinHeapify(int i)
    {
        int l = left(i);
        int r = right(i);
        int smallest = i;
        if (l < heap_size && harr[l] < harr[i])
            smallest = l;
        if (r < heap_size && harr[r] < harr[smallest])
            smallest = r;
        if (smallest != i) {
            swap(i, smallest);
            MinHeapify(smallest);
        }
    }

    int parent(int i) { return (i - 1) / 2; }

    // to get index of left child of node at index i
    int left(int i) { return (2 * i + 1); }

    // to get index of right child of node at index i
    int right(int i) { return (2 * i + 2); }

    // Method to remove minimum element (or root) from min heap
    int extractMin()
    {
        if (heap_size <= 0)
            return Integer.MAX_VALUE;
        if (heap_size == 1) {
            heap_size--;
            return harr[0];
        }

        // Store the minimum value, and remove it from heap
        int root = harr[0];
        harr[0] = harr[heap_size - 1];
        heap_size--;
        MinHeapify(0);

        return root;
    }

    // Inserts a new key 'k'
    void insertKey(int k)
    {
        if (heap_size == capacity) {
            System.out.println("Overflow: Could not insertKey");
            return;
        }

        // First insert the new key at the end
        heap_size++;
        int i = heap_size - 1;
        harr[i] = k;

        // Fix the min heap property if it is violated
        while (i != 0 && harr[parent(i)] > harr[i]) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    // A utility function to check
    // if size of heap is 1 or not
    boolean isSizeOne()
    {
        return (heap_size == 1);
    }

    // A utility function to swap two elements
    void swap(int x, int y)
    {
        int temp = harr[x];
        harr[x] = harr[y];
        harr[y] = temp;
    }
    static int minCost(int arr[], int n)
    {
        //Write code here
        int cost = 0; // Initialize result

        // Create a min heap of capacity equal
        // to n and put all ropes in it
        ConnectRopesWithMinimumCost minHeap = new ConnectRopesWithMinimumCost(arr, n);

        // Iterate while size of heap doesn't become 1
        while (!minHeap.isSizeOne()) {
            // Extract two minimum length ropes from min heap
            int min = minHeap.extractMin();
            int sec_min = minHeap.extractMin();

            cost += (min + sec_min); // Update total cost

            // Insert a new rope in min heap with length equal to sum
            // of two extracted minimum lengths
            minHeap.insertKey(min + sec_min);
        }

        // Finally return total minimum
        // cost for connecting all ropes
        return cost;
    }
    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        System.out.println(minCost(arr, n) + "\n" );
    }

}
/*
Connect n Ropes with Minimum Cost
Description
You are given n ropes of different lengths. The task is to connect all the ropes into a single rope with minimum cost. The cost to connect two ropes is equal to the sum of their lengths.



For example, if you are given 3 ropes of lengths 4,3, and 2. One of the ways to connect these ropes into a single rope is as follows:-

Connect ropes of lengths 2 and 3. Now you have 2 ropes of lengths 4 and 5.
Connect ropes of lengths 4 and 5.
The total cost to connect the ropes into a single rope will be 5+9=14. The second way to connect these ropes into a single rope is as follows:-

Connect ropes of lengths 2 and 4. Now you have 2 ropes of lengths 3 and 6.
Connect ropes of lengths 3 and 6.
The total cost to connect the ropes into a single rope will be 6+9=15. The third way to connect these ropes into a single rope is a follows:-

Connect ropes of lengths 3 and 4. Now you have 2 ropes of lengths 2 and 7.
Connect ropes of lengths 2 and 7.
The total cost to connect the ropes into a single rope will be 7+9=16. Clearly, the minimum cost to connect the ropes is 14.





Input Format:

The input contains the number of ropes followed by the length of each rope.



Output Format:

The output contains the minimum cost to connect the ropes into a single rope.





Sample Test Cases:

Input:

3 4 3 2



Output:

14
 */
