package com.dsa;
/*Recursion
Description
Write a Java program to calculate the sum of the digits of a given number using recursion.



Example:

Number: 492; then, the output is 4 + 9 + 2 = 15



The input accepts the number whose sum of digits needs to be evaluated, and the output prints the value of the sum.





Sample input

492

Sample output

15



Sample input

42

Sample output

6

 */
import java.util.*;
public class SumOfDigit {
    public static int sum(int n) {
        //write the logic here
        if (n == 0)
            return 0;
        return (n % 10 + sum(n / 10));

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sum(num));
    }
}
