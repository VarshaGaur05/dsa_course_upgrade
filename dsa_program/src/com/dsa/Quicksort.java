package com.dsa;

import java.util.*;

public class Quicksort {
    static int partition(int arr[], int low, int high){
        int pivot  = arr[high];
        int i = low-1;
        int j;
        for(j=0; j<high;j++){
            if(arr[j]<= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                j = temp;

            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;

    }
    static  void quickSort(int arr[], int low, int high){
        if(low<high){
            int p = partition(arr,low,high);
            quickSort(arr, low, p-1);
            quickSort(arr, high, p+1);
        }
    }
    public static void main(String args[]){
        int arr[] = {8, 7,2,1,0,9,6};
        int size = arr.length;

        Quicksort.quickSort(arr, 0,size-1);

        System.out.println(Arrays.toString(arr));

    }

}

/*
static int partition(int array[], int low, int high)
    {
        int pivot = array[high];

        int i = low -1;

        for (int j = low; j < high; j++)
        {
            if(array[j]<=pivot){

                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    static void quickSort(int array[], int low, int high)
    {
        if(low < high)
        {
            int p = partition(array, low, high);

            quickSort(array, low, p-1);
            quickSort(array, p+1, high);
        }
    }
 */
