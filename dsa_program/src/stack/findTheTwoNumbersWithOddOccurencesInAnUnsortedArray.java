package stack;
import java.util.*;

public class findTheTwoNumbersWithOddOccurencesInAnUnsortedArray {
    static void printTwoOdd(int arr[], int size)
    {
        /*Create map and calculate frequency of array of
         * elements using array.*/

        HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
        for (int i = 0; i < size; i++) {
            if(m.containsKey(arr[i])){
                m.put(arr[i], m.get(arr[i])+1);
            }
            else{
                m.put(arr[i], 1);
            }
        }

    /*Traverse through the map and check if its second
      element that is the frequency is odd or not.Then this
      is the odd occurring element .Its is clearly mentioned
      in problem that there are only two odd occurring
      elements so this will print those two elements.*/

        System.out.print("The two ODD elements are ");
        for (Map.Entry<Integer,Integer> x : m.entrySet()) {
            if (x.getValue() % 2 != 0)
                System.out.print(x.getKey()+ ", ");
        }
    }

    /* Driver code */
    public static void main(String[] args)
    {
        int arr[] = { 4, 2, 4, 5, 2, 3, 3, 1 };
        int arr_size = arr.length;
        printTwoOdd(arr, arr_size);
    }


}
