package com.dsa;
/*
Decimal to Binary
Description
You are given a decimal number. Convert the decimal number into the equivalent binary number.



Input Format:

The input contains the decimal number.



Output Format:

The output contains the binary number.





Sample Test Cases:

Input:

11



Output:

1011





Input:

5



Output:

101
 */

import java.util.*;

public class DecimalToBinary {
    static int decToBin(int n)
    {
        //Write code here
        if(n == 0)
        return 0;
        else
        return (10 * decToBin(n/2) + n % 2);
    }

    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        System.out.println(decToBin(n) + "\n" );
    }
}
