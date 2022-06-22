package com.dsa;
/*
Product of Two Integers Using Recursion
Description
You will be given two integers; they can be either positive and negative, and you have to print the product of the integers. You are not supposed to use loops or any of the multiplication, bitwise and division operators.

Input: The input will be in the following format:

The first line will be two integers separated by space.


Output: The output should be in the following format:

Print the product of two input integers.


Sample test case

Input:

-8 4



Output:

-32
 */
import java.util.*;
public class ProductofTwoIntegersUsingRecursion {
    /* This method returns the product of a and b using recursion */
    static int findProduct(int a, int b) {

        // Write your code here
        if (b == 0)
            return 0;

        /* Add a one by one */
        if (b > 0)
            return (a + findProduct(a, b - 1));

        /* the case where b is negative */
        if (b < 0)
            return -findProduct(a, -b);

        return -1;

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

       /* If Math.abs(b) is greater than Math.abs(a), then find the product of b and
        a by passing b and a to 'findProduct' */
        if (Math.abs(b) > Math.abs(a)) {
            System.out.println(findProduct(b, a));
        } else {
            System.out.println(findProduct(a, b));
        }
    }
}
