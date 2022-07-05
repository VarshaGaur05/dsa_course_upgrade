package GradedQuestion;
import java.util.*;

public class DeleteElement {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        deleteFirstHalf(stack);
    }

    // Method to delete the first half of the elements from the bottom of the stackand print the remaining elements
    static void deleteFirstHalf(Stack<Integer> stack) {
        // Write your code here
        Stack<Integer> temp = new Stack<>();
        Stack<Integer> temp1 = new Stack<>();
        int i = stack.size();
        int dest = stack.size() / 2;
        while (i-- > dest) {
            int t = stack.pop();
            temp.push(t);
        }
        while (!temp.isEmpty()) {
            int t = temp.pop();
            temp1.push(t);
        }
        System.out.print(temp1);
    }
}

/*Delete the elements
Description
You are given a stack with n integers. You need to delete floor(n/2) elements from the bottom of the stack and print the remaining elements of the stack. The remaining elements should be printed in the order that they are inserted into the stack.

floor(3.5) will give the output as 3, greatest integer less than or equal to the input.
Input Format:
The first line of input is an integer n denoting the size of stack. The next line contains n space separated integers.
Output Format:
The remaining elements of the stack after removal of the required elements.
Example:
Stack(bottom -> top) = [1, 2, 3, 4, 5, 6]
Output: [4, 5, 6]

Stack = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
Output: [6, 7, 8, 9, 10, 11]

Sample Input:
12
1 2 3 4 5 6 7 8 9 10 11 12

Sample Output:
[7, 8, 9, 10, 11, 12]

Note: You can use extra stack if needed.

 */
