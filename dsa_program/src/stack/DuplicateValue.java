package stack;
import java.util.*;



import java.util.Scanner;

public class DuplicateValue {
    public static int[] Duplicates(int[] array) {
        int len = array.length;
        //Create a hashset to store only unique values
        //TreeSet will store values in sorted order
        Set<Integer> set = new HashSet();

        for (int i = 0; i < len - 1; i++) {
            set.add(array[i]);
        }

        //Create new array of set size
        int newLen = set.size();
        int sortArray[] = new int[newLen];

        //Add set elements into the new array
        int j = 0;
        for (int index : set) {
            sortArray[j] = index;
            j++;
        }

        //Sort the new array using collection framework Array.sort() method
        //Arrays.sort(sortArray);
        //Sort the array using selection sort

        for (int i = 0; i < newLen - 1; i++) {
            int min = i;
            for (int k = i + 1; k < newLen; k++) {
                if (sortArray[k] < sortArray[min])
                    min = k;
            }
            int temp = sortArray[min];
            sortArray[min] = sortArray[i];
            sortArray[i] = temp;
        }
        return sortArray;
    }
        public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        int[] array = new int[n];

        for(int j=0; j<n ;j++){
            array[j] = scan.nextInt();
        }

        int[] result;

        result = Duplicates(array);

        for(int j=0; j<result.length; j++){
            System.out.println(result[j]);
        }
        return;
    }
}
