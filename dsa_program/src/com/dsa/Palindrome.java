package com.dsa;
/*Recursion
Description
Write a Java program using recursion to check if an input of five digits is a palindrome. A palindrome is a sequence of characters that reads the same backwards and forwards.

Example: 98789



Input format: The input should have all the five digits of the number with one digit in every line. The digit in the unit's place will be the last line.



Output format: It should print true/false corresponding to whether the input is a palindrome or not.



Sample input

9

8

7

8

9

Sample output

true



Sample input

1

2

3

4

5

Sample output

false

 */
import java.util.*;

public class Palindrome {
    public static boolean palindrome(int[] num, int index) {
        //write the logic here
        if(index == num.length){
            return true;
        }
        if (num[index] == num[(num.length-1)-index]){
            return palindrome(num,index+1);
        }else{
            return false;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        for(int i=0; i< 5;i++)
            num[i]=sc.nextInt();
        boolean answer =palindrome(num, 0);
        System.out.println(answer);
    }
}
