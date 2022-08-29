package DSAAssignment;

import java.util.Scanner;

import static java.lang.Math.min;

public class MostFrequentElement {
    public static int mostFrequentElement(int[] arr) {

        // Write code here
        int n= arr.length;
        int maxCount = 0;
        int ans = 0;
        if(arr[0] == 0){
            ans = -1;
        }
        else {
            for(int i=0;i<n;i++){
                int currCount = 1;
                for(int j=i+1;j<n;j++){
                    if(arr[i] == arr[j]){
                        currCount++;
                    }
                }
                if(currCount > maxCount){
                    maxCount = currCount;
                    ans = arr[i];
                }else if(maxCount == currCount){
                    ans = min(ans,arr[i]);
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(mostFrequentElement(arr));
    }
}
/*
Given an array of integers, find the most frequent element in the array. If multiple elements appear a maximum number of times, print any one of them. Return -1 in case there are no elements.



Input Format:

The first line contains the size of the array, N.

The second line contains the elements of the array.



Output Format:

The output contains the most frequent element in the array.



Sample Test Cases:

Input:

8

1 3 2 5 2 1 9 2



Output:

2



Input:

8

10 15 12 11 13 12 11 11



Output:

11
 */
