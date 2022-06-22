package com.dsa;

import java.util.*;
public class NumberOfSwaps {

    static int totalBubbleSortSwaps(int[] array, int M) {
        int size = array.length-1;
        int var = 0;
        boolean isDone = true;
        int totalSwaps = 0;
        //Write your code here
        for(int i= 0;i< M;i++){
            for(int j=1; j< size-i;j++){
                if (array[j-1] < array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    totalSwaps++;
                }
            }
        }
        return totalSwaps;
    }

    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        int M = input.nextInt();
        int n = input.nextInt();
        int[] array = new int[n];

        for(int i=0 ;i < array.length;i++){
            array[i] = input.nextInt();
        }

        System.out.println(totalBubbleSortSwaps(array, M));
    }
}

/*
Bubble Sort Code
Description
Write a bubble sort program that prints the number of swaps made after M number of iterations (In this case, ‘M’ should be an input value).

For example, if M = 0, the bubble sort program will perform 0 swaps in 0 iterations.

In bubble sort, an iteration is defined as the total number of times the outer loop runs. Assume that:
1) M <= the array size and
2) the program sorts in descending order.

The code should ask the user to input the values for M, the array size, and finally the elements of the array. So, there will be three types of inputs —

Input 1: The value of M
Input 2: The size of the array
Input 3: The elements inside the array

Sample Input:
2
4
1
2
3
4

Sample Output:
5

In this input, the first two numbers denote the values for M and the size of the array, respectively. And rest of the numbers denote the elements inside the array.

Hint: The code provided in the text shall help you solve the problem.
 */
