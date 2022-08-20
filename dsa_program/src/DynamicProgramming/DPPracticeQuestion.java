package DynamicProgramming;

import java.util.Scanner;

public class DPPracticeQuestion {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int k = s.nextInt();
        maxAverageSum(arr, n, k);
    }

    // Method to find max average of k groups using DP
    static void maxAverageSum(int arr[], int n, int k) {
        // Write your code here
        double[] pre_sum = new double[n + 1];
        pre_sum[0] = 0;
        for (int i = 0; i < n; i++)
            pre_sum[i + 1] = pre_sum[i] + arr[i];

        // for each i to n storing averages
        double[] dp = new double[n];
        double sum = 0;
        for (int i = 0; i < n; i++)
            dp[i] = (pre_sum[n] - pre_sum[i]) / (n - i);

        for (int l = 0; l < k - 1; l++)
            for (int i = 0; i < n; i++)
                for (int j = i + 1; j < n; j++)
                    dp[i] = Math.max(dp[i], (pre_sum[j] -
                            pre_sum[i]) / (j - i) + dp[j]);

       if((int)dp[0]> 0) {
           System.out.println((int) dp[0]);
       }else{
           System.out.println("Invalid Input");
       }
    }
}
/*
You are given an array of marks of students in roll number order. You have to partition the array into k adjacent (non-empty) groups in such a way that sum of averages of each group is maximum. Use the hint provided above.
Input: The input will be in the following format :
The first line should be the number of students in class.
The second line should be the marks of students in roll number order.
The third line should be the number of groups should be made.

Output: The output should be of the following format:
Print the maximum sum.
Note: If any element is negative print “Invalid Input”.

Example :
Input :
10
3 5 2 7 9 13 34 23 11 6
4
Output:
72

Input:
8
0 -3 0 -4 -5 0 0 -1
3
Output:
Invalid Input
 */
