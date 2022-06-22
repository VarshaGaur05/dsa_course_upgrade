package com.dsa;
/*
GCD Using Recursion
Description
The GCD (Greatest Common Divisor) of two numbers is the largest number that divides both the numbers. You are given two numbers. Determine their GCD.



Input Format:

The input contains the two numbers.



Output Format:

The output contains the GCD of the numbers





Sample Test Cases:

Input:

40 70



Output:

10





Input:

13 9



Output:

1
 */
import java.util.*;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class GCDRecursion {

    /*static int gcd(int x, int y)
    {
        if(y==0)
            return x;

        return gcd(y, x%y);
    }*/

    static int gcd(int x, int y)
    {
        //Write code here
        int result=min(x,y); // Find Minimum of a nd b
        while(result>0)
        {
            if(x%result==0 && y%result==0)
            {
                break;
            }
            result--;
        }
        return result;// return gcd of a nd b
    }

    public static void main(String args[])
    {
        int x, y;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        y = s.nextInt();

        System.out.println(gcd(x, y) + "\n" );
    }
}
