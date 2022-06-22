package com.dsa;
import java.util.*;
public class InsertionSortOne {
    public static void insertionSort(int[] array) {
        int size = array.length;
        for (int i = 1; i < size; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && key > array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.println(arr[i]);
        }

    }
    public static void main(String args[]) {
        InsertionSortOne sorting = new InsertionSortOne();
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        sorting.insertionSort(array);
        printArray(array);

    }


}

/*
Insertion Sort Code
Description
Write a program in Java that can return an array in descending order of elements using insertion sort.
The program will take the size of the array and the elements of the array as inputs.
Sample Input:
4
1
2
3
4
Sample Output:
4
3
2
1

Here, input value ‘4’ (the first input) corresponds to the array size, and the rest of the numbers correspond to the elements of the array.
 */
