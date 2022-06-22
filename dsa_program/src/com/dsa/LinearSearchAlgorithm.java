package com.dsa;
/*Linear Search Algorithm
Description
Given an array of non-negative integers, write a code to search the position of an element in the array in the reverse order. Do not print anything when the element is not present in the given array.
Also, if the key is repeated, print the index where the key is appearing for the first time in reverse order.

The code should :
Take the size of the array as an input from the user.
The elements of the array as an input from the user.
The key you are searching for, as an input from the user.

Sample Input:
7
6 8 3 5 9 1 2
9
Sample Output:
2
Here the output is 2 because the position of number 9 is 2 from the reverse order as mentioned in the question.

 */

import java.util.*;
public class LinearSearchAlgorithm {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        //Declare the array here

        int i;
        int count = input.nextInt();
        int array[] = new int[count];

        for (i = 0; i < count; i++) {
            array[i] = input.nextInt();
        }
        int key = input.nextInt();
        input.close();
        //write your code here
        int result = linearSearch(array, key);
        System.out.println(result);

    }
    public static int linearSearch(int[] array, int key) {
        int size = array.length - 1;
        int iteration =-1;
        for (int i = size; i >= 0; i--) {
            iteration++;
            if (array[i] == key) {
                return iteration;
            }
        }
        return -1;
    }


}
