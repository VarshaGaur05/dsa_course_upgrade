package SetsDictionaries;
import java.util.*;

public class FirstUniqueCharacter {
    static final int NO_OF_CHARS = 256;
    static char count[] = new char[NO_OF_CHARS];

    /* calculate count of characters
       in the passed string */
    static void getCharCountArray(String str)
    {
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)]++;
    }

    /* The method returns index of first non-repeating
       character in a string. If all characters are repeating
       then returns -1 */
    static int firstNonRepeating(String str)
    {
        getCharCountArray(str);
        int index = -1, i;

        for (i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                index = i;
                break;
            }
        }

        return index;
    }
    public static void main(String arg[]) {

        Scanner in = new Scanner(System.in);

        //storing the input string to String variable "str"
        String str = in.nextLine();
        //write your code here
        int index = firstNonRepeating(str);
        System.out.println(index == -1 ? "-1" : str.charAt(index));

    }

}
/*
Description
You will be given a string, and you have to print the first unique character of the string, i.e., the non-repeating character of the string.

Note:

The string may contain duplicates.
If there is no unique character, then print -1.


Input: The input will be in the following format:

The first line will be a string.
Output: The output should be in the following format:

Print the first unique character of the string or -1 if no unique character is found.


Sample Input-1:

abcdabdef


Sample output-1:

c
The input is a string "abcdabdef". The output is character c from the input string, as c is the only character that is not repeated in the string.



Sample input-2:

aabb


Sample output-2:

-1
The input is a string "aabb". The output is -1, as there is no non-repeating character present in the input string.
 */
