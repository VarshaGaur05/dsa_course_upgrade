package DynamicProgramming;

import java.util.Scanner;

public class ExtendedFibonacciSequence
{
    static int fib(int n)
    {
        /* Declare an array to store Fibonacci numbers. */
        int f[] = new int[n];
        int i;


        /* Assign 0th, 1st, 2nd number of the Fibonacci series to 0,1,2 respectively*/
        f[0] = 0;
        if (n==1)
            return f[0];
        f[1] = 1;
        f[2] = 2;
        /* Add the previous 3 numbers in the series and store it*/
        for (i = 3; i <= n-1; i++)
        {
            f[i] = f[i-1] + f[i-2] + f[i-3];
        }

        /* Return nth element in the series */
        return f[n-1];
    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        // Enter the number n
        int n = scan.nextInt();
        System.out.println(fib(n));
        scan.close();
    }
}

/*Description
A mathematical series where each element is the sum of the three preceding numbers, is given below:
0, 1, 2, 3, 6, 11, 20, 37, 68, ... (nth element)
Print the nth element in this series.
The input takes in the value of n that is number in the sequence whose value needs to printed.
The output prints out the value of the nth element in the sequence.

Sample Input
6
Sample Output
11

Sample Input
9
Sample Output
68

Note that array indexing starts from 0, so to print the nth element, element at index n-1 should be printed.

 */
