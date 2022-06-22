package com.dsa;

/*


Sample Test Cases:

Input:

4 4 5 8 3



Output:

1





Input:

4 4 2 8 3



Output:

-1
 */
import java.util.*;

public class NobelInteger {
    static int nobleNum(int arr[], int n)
    {
        //Write code here
        int size = arr.length;
        for (int i = 0; i < size; i++ )
        {
            int count = 0;
            for (int j = 0; j < size; j++)
                if (arr[i] < arr[j])
                    count++;

            // If count of greater elements
            // is equal to arr[i]
            if (count == arr[i])
                return 1;
        }
        return -1;
    }

    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        System.out.println(nobleNum(arr, n) + "\n" );
    }
}
