package com.dsa;
/*
Find last non-zero digit in n!
Description
For a given integer n, find the last non-zero digit in the factorial of n.

n! = n * (n-1) * (n-2) * .... * 3 * 2 * 1



Input format:

The first line should be the value of n.



Output format:

In the first line, print the last non-zero digit of n!.



Sample Input:

5

Sample Output:

2



Sample Input:

10

Sample Output:

8



Note:

The value of n will be less than or equal to 10.
 */

import java.util.*;

public class FindLastNonZroDigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(lastNonZeroDigit(n));
    }
    // Initialize values of last non-zero digit of
    // numbers from 0 to 9
    static int dig[] = {1, 1, 2, 6, 4, 2, 2, 4, 2, 8};


    // Method to find the last digit of n!

    static int lastNonZeroDigit(int n) {
        // Write your code here
        if (n < 10)
            return dig[n];

        // Check whether tens (or second last)
        // digit is odd or even
        // If n = 375, So n/10 = 37 and
        // (n/10)%10 = 7 Applying formula for
        // even and odd cases.
        if (((n / 10) % 10) % 2 == 0)
            return (6 * lastNonZeroDigit(n / 5) * dig[n % 10]) % 10;
        else
            return (4 * lastNonZeroDigit(n / 5) * dig[n % 10]) % 10;
    }
}
