package DSA;

import java.util.Arrays;
import java.util.Scanner;

class sortQuest1 {
  
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
    
       int index = findWrongIndex(array1);
      checkValue(array1, array2, index);

   }
   
   //sort array 2 in descending order just in case given an input of unsorted array2
	 public static void insertSort(int[] arr){

		   for( int i =1 ;i<arr.length;i++){
		     int v = arr[i];
		     int j= i;

		     while(j>=1 && arr[j-1]<v){
		       arr[j]=arr[j-1];
		       j--;
		     }
		     arr[j]=v;
		   }
		 }
	 
	 // find the index of wrong element in array1 and return negative if sorted
	 public static int findWrongIndex(int[] arr) {
		 int i;
		 int n = arr.length;
		 for(i = 0; i < n && i+1 < n; i++) {
			 if(arr[i] > arr[i+1]) {
				 return i+1;
			 }
		 }
		 return -1;
	 }
	 
	 
	 // swap index value with element from array2 and check if the array1 is sorted
	 public static void checkValue(int[] arr1, int[] arr2, int index) {
		 insertSort(arr2);
		 int n = arr2.length;
for(int i = 0 ; i < n; i++) {
	arr1[index] = arr2[i];
	int wrongIndex = findWrongIndex(arr1);
	if(wrongIndex == -1) {
		System.out.print(arr2[i]);
		break;
	} else if (i == n-1 && wrongIndex != -1) {
		System.out.print("Not Possible");
	}
}
}
	 }
	 

/*
 * Make the Unsorted Array Sorted
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

Execution Time Limit
15 seconds
 * */
 

