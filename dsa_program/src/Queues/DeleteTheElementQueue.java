package Queues;
import java.util.*;

public class DeleteTheElementQueue {
    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            queue.add(s.nextInt());
        deleteSecondHalf(queue);
    }

    // Method to delete the second half of the elements and print the remaining elements
    static void deleteSecondHalf(Queue<Integer> queue) {
        // Write your code here
        Queue<Integer> temp = new LinkedList<Integer>();
        Queue<Integer> temp1 = new LinkedList<Integer>();
        int i = queue.size();
        int dest = queue.size() / 2;
        while (i-- > dest) {
            int t = queue.poll();
            temp.add(t);
        }
        while (!temp.isEmpty()) {
            int t = temp.poll();
            // System.out.print(i + " size");
            temp1.add(t);
        }
        System.out.print(temp1);


    }
}
/*Upgrade Solution
import java.util.*;

public class Source {
    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            queue.add(s.nextInt());
        deleteSecondHalf(queue);
    }

    // Method to delete the second half of the elements and print the remaining elements
    static void deleteSecondHalf(Queue<Integer> queue) {
        int n = queue.size();
        int temp = n - n / 2;
        // Removing the first ceil(n/2) elements of the queue and adding back to the same queue
        for (int i = 0; i < temp; i++)
            queue.add(queue.remove());
        // Removing the end floor(n/2) elements of the original queue
        for (int i = 0; i < n / 2; i++)
            queue.remove();
        // Printing the remaining elements
        System.out.println(queue);
    }
}


 */
/*Delete the elements
Description
You are given a queue with n integers. You need to delete the second half of the elements i.e., floor(n/2) elements from the head of the queue and print the remaining elements.

floor(3.5) will give the output as 3, greatest integer less than or equal to the input
Input format:
The first line of input is an integer n denoting the size of the queue. The next line contains n space separated integers.
Output Format:
The output should be the remaining queue after deleting the required elements.
Example:
Queue(head -> tail) = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
Output: [1, 2, 3, 4, 5, 6]
Queue (head -> tail)= [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
Output: [1, 2, 3, 4, 5, 6]
Sample Input:
12
1 2 3 4 5 6 7 8 9 10 11 12
Sample Output:
[1, 2, 3, 4, 5, 6]

 */
