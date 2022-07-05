package GradedQuestion;
import java.util.*;

public class SortTheQueue {
    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            queue.add(s.nextInt());
        sort(queue);
    }

    // Method to sort the queue
    static void sort(Queue<Integer> queue) {
        // Write your code here
        Queue<Integer> temp = new LinkedList<Integer>();

       int n = queue.size();
        for (int i = 0; i < n; i++) {
            // Find the index of smallest element from the unsorted queue
            int minIndex = -1;
            int minValue = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                int currValue = queue.poll();
                // Find the minimum value index only from unsorted queue
                if (currValue < minValue && j < (n - i)) {
                    minValue = currValue;
                    minIndex = j;
                }
                queue.add(currValue);
            }
            // Remove min value from queue
            for (int j = 0; j < n; j++) {
                int currValue = queue.poll();
                if (j != minIndex) {
                    queue.add(currValue);
                }
            }
            // Add min value to the end of the queue
            queue.add(minValue);
        }
        // Print the sorted queue
        for (Integer i : queue) {
            //System.out.print(i + " ");
            temp.add(i);
        }
        System.out.println(temp);
    }
}
/*
Sort the queue
Description
You are given a queue with n integers. You need to sort the queue in ascending order such that the minimum value is at the head of the queue. The expected input is the the number of elements and the elements of the queue, you need to print the elements in the queue after they are sorted in ascending order.

Example:
Queue (head -> tail)= [6, 12, 3, 4, 5, 1, 7, 8, 10, 9, 11, 2]
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]

Input Format:
12
6 12 3 4 5 1 7 8 10 9 11 2

Output format:
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]

Note: You can use extra queue if needed.
 */
