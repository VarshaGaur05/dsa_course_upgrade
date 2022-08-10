package GreedyAlgo;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinimumPlatformsRequired {
    static int findPlatform(int arr[], int dep[], int n)
    {
        //Write code here
        int plat_needed = 1, result = 1;
        int i = 1, j = 0;

        // run a nested  loop to find overlap
        for (i = 0; i < n; i++) {
            // minimum platform
            plat_needed = 1;

            for (j = i + 1; j < n; j++) {
                // check for overlap
                if (Math.max(arr[i], arr[j])
                        <= Math.min(dep[i], dep[j]))
                    plat_needed++;
            }

            // update result
            result = Math.max(result, plat_needed);
        }

        return result;
    }

    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        int dep[] = new int[n];
        for(int i = 0; i < n; i++)
            dep[i] = s.nextInt();

        System.out.println(findPlatform(arr, dep, n) + "\n" );
    }
}
/*
Minimum Platforms Required
Description
You are given the arrival and departure times of all trains that reach and leave the railway station. The task is to find the minimum number of platforms required for the railway station such that no train waits.

For example, consider the arrival time of the trains as arr[] = {9:00, 9:40, 9:50, 11:00, 15:00, 18:00} and departure time of the trains as dep[] = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00}. There are at most 3 trains at a time on the platform. Hence, the minimum number of platforms required in this case is 3.





Input Format:

The input contains a number of total trains followed by the arrival time of each train. This is followed by the departure time of each train. You can skip the colon while storing the time. For example, 9:00 can be represented as 900.



Output Format:

The output contains the minimum number of platforms required for the railway station.





Sample Test Cases:

Input:

6 900 940 950 1100 1500 1800 910 1200 1120 1130 1900 2000



Output:

3
 */
