package Queues;

import java.util.*;

class DequeueMethod {
    public static Deque<Integer> deque = new LinkedList<Integer>();

    public static void add_atend(int data) {
        deque.addLast(data);
    }

    public static void add_athead(int data) {
        deque.addFirst(data);
    }

    public static void delete_atend() {
        if(deque.isEmpty()){
            System.out.println("Not possible");
        }else{
            deque.removeLast();
        }

    }

    public static void delete_athead() {
        if(deque.isEmpty()){
            System.out.println("Not possible");
        }else{
            deque.removeFirst();
        }

    }

    public static int return_head() {
        return deque.getFirst();
    }

    public static int return_tail() {
        return deque.getLast();
    }

    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int value;
        for (int j = 0; j < n; j++) {
            value = in.nextInt();
            switch (value) {
                case 1:
                    add_atend(in.nextInt());
                    break;
                case 2:
                    add_athead(in.nextInt());
                    break;
                case 3:
                    delete_atend();
                    break;
                case 4:
                    delete_athead();
                    break;
                case 5:
                    System.out.println(return_head());
                    break;
                case 6:
                    System.out.println(return_tail());
                    break;
            }
        }
        System.out.println(deque);
    }
}

/*
Operations on deque.
Description
You are given an empty deque. There are some incomplete methods which execute on the deque, you should complete those methods to get the required changes in the deque.

Note 1: Go through the comments in the program below.
Note 2: If you are asked to delete from the empty deque then print “Not possible”
Note 3: The Deque given to you is named as "deque"

Sample Input:
10
1 5 1 4 1 2 1 1 1 3 3 4 5 2 6 6

Expected Output:
4
1
[6, 4, 2, 1]

Explanation:
Input:- The first line of input (here- 10) is n. The next line contains space-separated inputs. The inputs majorly contain values from 1 to 6. If the input is 1,  the code takes the next value to be the integer to input at the end of deque (here- 5 is next input to 1, so the value is inserted into the deque at the end). Similarly is for input 2, the code takes the next value to be the integer to input at the head of the deque (here- 6 is next input to 2, so the value is inserted into the deque at the head). For inputs 3, 4, 5, 6, the code works normally. If the input is 3, the value at the end of the deque is deleted. Similarly, if the input is 4, the value at the head of the deque is deleted. For input 5, the value at the head of the deque is printed. For input 6, the value at the end of the deque is printed.

Output:-  The first line is the output of input 5, that is 4 which is the value at the head of the deque (5, 4,2,1,3 are inserted at the end of the deque, then by input 3 and 4 the values 5 and 3 are deleted). The next line is the output of last input 6 that is 1 which is the value at the tail of the deque (after inputs 3 and 4, 2 the input which inserts the value 6 at the head of the deque). The last line is the elements left in the deque.
 */
