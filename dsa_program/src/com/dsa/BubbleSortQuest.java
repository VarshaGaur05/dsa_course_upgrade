package DSA;

import java.util.Scanner;
class BubbleSortQuest {
static int totalBubbleSortSwaps(int[] array, int M) {
     int size = array.length;
     int var = 0;
     int totalSwaps = 0;
     //Write your code here
     for (int i = 0; i < M; i++) {
         // setting the initial value of swap to zero.
         for (int j = 1; j < size - i; j++) {
             
             if (array[j - 1] < array[j]) {
                 //swapping when element at position j-1 is greater than element at j position.
                 int temp = array[j - 1];
                 array[j - 1] = array[j];
                 array[j] = temp;
                 totalSwaps = totalSwaps  + 1;
                 
             }
         }
     }
     return totalSwaps;
 }

 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 int M = scanner.nextInt();
     int size = scanner.nextInt();
     int array[] = new int[size];
     for (int i = 0; i < size; i++) {
         array[i] = scanner.nextInt();
     }
     System.out.print(totalBubbleSortSwaps(array,M));

 }
}
