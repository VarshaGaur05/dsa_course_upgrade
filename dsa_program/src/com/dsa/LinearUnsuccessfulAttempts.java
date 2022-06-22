package com.dsa;

import java.util.*;
public class LinearUnsuccessfulAttempts {
    public int getBinarySearchUnsuccessfulComparisonCount(int[] inputArr, int key) {
        // Write your code here
        int size = inputArr.length;
        for (int i = 0; i < size; i++) {
            if (inputArr[i] == key) {
                return i;
            }
        }
        //This is the default value if the key is not found in the array.
        return size;
    }
    public static void main(String args[] ) throws Exception {
        LinearUnsuccessfulAttempts bs = new LinearUnsuccessfulAttempts();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        System.out.println(bs.getBinarySearchUnsuccessfulComparisonCount(array, key));
    }
}

/*Number of Unsuccessful Attempts
Description
Write a code that returns the number of unsuccessful attempts made to search for an element in the array using linear search.
The code should
Take the size of the array as an input from the user
The elements of the array as an input from the user
The key you are searching for as an input from the user
Sample Input-1:
5
2 3 4 5 8
8

Sample Output-1:
4
So in this sample test case, the first input is the size of the array i.e the array has 5 elements. Next 5 inputs are the elements inside the array. The last input i.e. 8 is the key the code should search for. Since in this case, it will take 4 unsuccessful steps (comparing elements 2, 3, 4 and 5 with 8) for the code to reach 8, so the output is 4.

Sample Input-2:
20
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
21

Sample Output-2:
20
So in this sample test case, the first input is the size of the array i.e the array has 20 elements. Next 20 inputs are the elements inside the array. The last input i.e. 8 is the key the code should search for. Since in this case, it will take  20 unsuccessful steps (comparing 1, 2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19, 20 with 21) for the code to reach the conclusion that 21 does not exist in the array. Thus the output will be 20.

 */
