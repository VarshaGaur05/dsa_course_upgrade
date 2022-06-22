package com.dsa;
/* Duplicate in an Array
Description
You are given an array of 'n' integers. The integers in the array are between 1 and n-1. You have to find the duplicate.

You need to do it in O(n) time, but you can use extra space.



Input Format:

The input contains the number of elements in the array, followed by the elements in the array.



Output Format:

The output returns the duplicate integer or returns -1 if there is no duplicate.





Sample Test Cases:

Input:

5 1 4 3 2 3



Output:

3



Input:

4 1 3 2 1



Output:

1

 */

import java.util.*;
public class DuplicateNumber {
    static void duplicate(int arr[], int n)
    {
        //Write code here
        //First check all the values that are
        // present in an array then go to that
        // values as indexes and increment by
        // the size of array
        for (int i = 0; i < n; i++)
        {
            int index = arr[i] % n;
            arr[index] += n;
        }
        // Now check which value exists more
        // than once by dividing with the size
        // of array
        for (int i = 0; i < n; i++)
        {
            if ((arr[i] / n) >= 2) {
                System.out.print(i + " ");
            }
        }

    }

    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        duplicate(arr, n);
    }
}
