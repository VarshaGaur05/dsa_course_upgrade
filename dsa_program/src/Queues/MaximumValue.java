package Queues;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class MaximumValue{
    static Queue<Integer> q = new LinkedList<Integer>();

    public static void func() {
        //Finding the maximum element
        int max = q.peek();
        for (int i = 0; i < q.size(); i++) {
            int del = q.remove();
            if (max < del) {
                max = del;
            }
            q.add(del);
        }
        // Adding the maximum element to the end of the queue.
        int s = q.size();
        for (int i = 0; i < s; i++) {
            int del = q.remove();
            if (del != max) {
                q.add(del);
            }
        }
        q.add(max);
    }

    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int j = 0; j < n; j++) {
            q.add(in.nextInt());
        }
        func();
        System.out.println(q);
    }
}

/*
Description
You are given a queue. Your aim is to find the maximum element of the queue and move that element to the end of the queue.
Input Format:
The first line of input is an integer n denoting the size of the queue. The next line contains n space separated integers.
Output Format:
The output should be a queue with the largest element at the end of the queue.

Example: if the queue contains [2, 1, 5, 4] then you have to find out the max value in the queue which is ‘5’ in this case and move that to the end of the queue. After making the required changes the queue should look like [2, 1, 4, 5].
Sample Input:
5
3 5 2 6 4
Sample Output:
[3, 5, 2, 4, 6]
Note: The queue in the below program is named as ‘q’
 */
