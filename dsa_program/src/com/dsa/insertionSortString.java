package DSA;

import java.util.Scanner;

public class insertionSortString {
	public static void sortFirst(String[] array){
		for(int i = 1; i<array.length;i++) {
			int j = i-1;
			String key = array[i];
			while(j>=0) {
				if(key.compareTo(array[j]) > 0) {
					break;
			}
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}
		for(int i = 0; i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void sortLast(String[] array){
		for(int i = 1; i<array.length;i++) {
			int j = i-1;
			String key = array[i];
			while(j>=0) {
				if(key.compareTo(array[j]) < 0) {
					break;
			}
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}
		for(int i = 0; i<array.length;i++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String ss[]) {
	       Scanner scanner = new Scanner(System.in);
	       int size = scanner.nextInt();
	       String firstNames[] = new String[size];
	       String lastNames[] = new String[size];
	       for (int i = 0; i < size; i++) {
	           firstNames[i] = scanner.next().toLowerCase();
	       }
	       for (int i = 0; i < size; i++) {
	           lastNames[i] = scanner.next().toLowerCase();
	       }

	       //Write your code here
	       sortFirst(firstNames);
	       sortLast(lastNames);
	       
	   }

}
