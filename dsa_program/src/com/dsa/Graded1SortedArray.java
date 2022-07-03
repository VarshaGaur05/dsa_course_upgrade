package com.dsa;
import java.util.*;


public class Graded1SortedArray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n1 = s.nextInt();
        int[] array1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            array1[i] = s.nextInt();
        }

        int n2 = s.nextInt();
        int[] array2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            array2[i] = s.nextInt();
        }

        // Write your code here
        int temp1 =0;
        int temp2 =0;
        int temp3 = -1;

        for(int i = 0; i< array1.length -1; i++){
            if(array1[i]>array1[i+1]){
                temp1 = array1[i];
                temp2 = array1[i+2];
            }
        }

        for (int j=0; j<= array2.length-1;j++){
            if(array2[j] > temp1 && array2[j] < temp2){
                if(array2[j] >= temp3){
                    temp3 = array2[j];
                }
            }
        }

        if(temp3 == -1) {
            System.out.println("Not Possible\n");
        }else {
            System.out.println(temp3);
        }

    }

}
/*
Make the Unsorted Array Sorted
Description
You will be given two arrays of integers, array1 and array2. The array1 will be almost sorted in ascending order with just one element in the wrong position making the array unsorted. You need to find a maximum possible element from the array2 which makes the array1 sorted after replacing the wrongly positioned element of the array1 with this element.



Note:

The wrongly placed element in the array1 will not be at the 0th index of the array or at the (n-1)th index of the array.
If there is no element in array2[] which can make array1[] sorted, then print ‘Not Possible’
array1 might contain duplicates. A sorted array can contain duplicates.
If array1[i] is less than array1[i-1], then index i is the wrong index.


Input Format:

The first line will be an integer ‘n1’ representing the size of the array1.
The next line will be n1 space separated integers representing the elements of the array1.
The next line will be an integer ‘n2’ representing the size of the array2.
The next line will be n2 space separated integers representing the elements of the array2.


Output Format:

Print the maximum possible element from the array2 which makes the array1 sorted after replacing the wrongly positioned element of the array1 with this element from array2.


Sample Input 00:

5

2 7 8 6 13

4

15 11 9 5



Sample Output 00:

11



Explanation 00:

Element 6 in array1 can be replaced by element 11 (maximum possible) in array2.



Sample Input 01:

5

2 7 8 6 13

4

14 15 16 17



Sample Output 01:

Not Possible



Explanation 01:

6 is the misplaced element in array1 making it unsorted. It is not possible to make array1 sorted from the elements in array2 because all elements in array2 are greater than 13.
 */
