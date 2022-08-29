package DSAAssignment;
import java.util.*;

public class FindMedianAfterMergingTwoSortedArrays {
    public static int median(int[] arr1, int[] arr2 , int n){
        // Write code here
        int i = 0, j = 0, m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2[0];
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1[0];
                break;
            }
            if (arr1[i] <= arr2[j]) {
                m1 = m2;
                m2 = arr1[i];
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2[j];
                j++;
            }
        }
        return (m1 + m2)/2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr1[] = new int[n];
        int arr2[] = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr1[i] = sc.nextInt();
        }

        for(int i = 0 ; i < n ; i++){
            arr2[i] = sc.nextInt();
        }
        System.out.println(median(arr1, arr2, n));
    }
}
/*
Find Median After Merging Two Arrays
Description
Write a program to find the median of the array obtained after merging the two given sorted integer arrays of the same length. Note that both the arrays are sorted.





Input Format:

The first line contains an integer N as the size of both the arrays.

The second line contains elements of the first array of size N.

The next line contains elements of the second array of size N.



Output Format:

Print the median of the array obtained after merging the two given integer arrays.





Sample Test Cases:

Input:

5

1 12 15 26 38

2 13 17 30 45



Output:

16
 */
