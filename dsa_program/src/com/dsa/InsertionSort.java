package com.dsa;

public class InsertionSort {
    public static void insertSort(int[] arr){

        for( int i =0 ;i<3;i++){
            int v = arr[i];
            int  j= i;

            while(j>=1 && arr[j-1]>v){
                arr[j]=arr[j-1];
                j--;
            }

            arr[j]=v;
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 8, 9, 10, 15, 4, 3, 6, 7};
        insertSort(arr);
        System.out.println("Sorted array");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}
