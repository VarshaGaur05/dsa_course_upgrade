package com.dsa;

import java.util.*;

public class MergeSortDecreasingOrder {
    public static int[] sort(int[] randomNumbers) {
        return mergeSort(randomNumbers, 0, randomNumbers.length - 1);
    }

    public static int[] mergeSort(int[] numbers, int first, int last) {
        // first denotes the starting index of the "numbers" array
        // last denotes the ending index of the "numbers" array

        //Complete this function
        if (last <= first)
            return numbers;
        int mid = (first + last) / 2;
        mergeSort(numbers, first, mid);
        mergeSort(numbers, mid + 1, last);
        merge(numbers, first, mid, last);
        return numbers;
    }

    /// .......
    // Write the Merge function here which uses the merge sort to sort the array in decreasing order...
    /// .......
    private static void merge(int[] array, int low, int mid, int high) {
        int leftArr[] = new int[mid - low + 1];
        int rightArr[] =new int[high - mid];

        for(int i=0; i < leftArr.length;i++){
            leftArr[i] = array[low + i];
        }
        for(int i=0; i < rightArr.length;i++){
            rightArr[i] = array[mid + i + 1];
        }

        int l = 0;
        int r = 0;

        for(int i= low; i < high + 1 ; i++) {
            if (l < leftArr.length && r < rightArr.length) {
                if (leftArr[l] > rightArr[r]) {
                    array[i] = leftArr[l];
                    l++;
                } else {
                    array[i] = rightArr[r];
                    r++;
                }
            } else if (l < leftArr.length) {
                array[i] = leftArr[l];
                l++;
            } else if (r < rightArr.length) {
                array[i] = rightArr[r];
                r++;
            }
        }

        }


    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = scanner.nextInt();
        }
        int[] sortedNumbers;
        sortedNumbers = sort(randomNumbers);
        System.out.println(Arrays.toString(sortedNumbers));
    }

}

/*
Description
Write a code that sorts an array in decreasing order using Merge Sort algorithm.

Note that the array in the question which needs to be sorted is named as "randomNumbers". You need to sort the numbers inside the "randomNumbers" array and store the sorted array inside the "sortedNumbers" array.

Input:
         1. The first input is 'n', that is, the number of elements in the array.
         2. In the next line, n elements of the array space-separated.

Output:
The array sorted in decreasing order.

Sample Test Case-1
Sample Input-1:
8
9 45 76 23 47 1 5 11

Sample Output-1
[76,47,45,23,11,9,5,1]
The first input is n (number of elements in the array), here it is 8. The next line in the input represents the elements of the array (space-separated). The output is the same array arranged in decreasing order.

Sample Test Case-2
Sample Input-1:
4
1 4 19 3

Sample Output-1
[19,4,3,1]
The first input is n (number of elements in the array), here it is 4. The next line in the input represents the elements of the array (space-separated). The output is the same array arranged in decreasing order.
 */
