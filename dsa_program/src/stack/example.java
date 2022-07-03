package stack;

import java.util.Scanner;
import java.util.Stack;

public class example {
    /*public static void main(String arg[]) {
        Stack<Integer> s = new Stack<Integer>();
        System.out.println(s.empty());
        s.push(11);
        s.push(22);
        s.push(33);
        s.push(44);
        s.push(55);
        System.out.println(s);
        System.out.println(s.search(22));
        System.out.println(s.search(6));
        System.out.println(s.pop());
        System.out.println(s);
    }*/
   /* private static Stack<Integer> stack = new Stack<Integer>();
    public static void main(String[] args)
    {
        stack.push(5);
        stack.push(3);
        stack.push(4);
        stack.pop();
        System.out.println(stack.peek());
        stack.push(9);
        System.out.println(stack);
    }*/
//    public static void main(String[] args) {
//        Stack<Character> new_stack=new Stack<>();
//        Scanner in=new Scanner(System.in);
//        String inputString=in.nextLine();
//        for(int k=0;k<inputString.length();k++) {
//            if (inputString.charAt(k) == ')') {
//                new_stack.push(inputString.charAt(k));
//            }
//            if (inputString.charAt(k) == '(') {
//                if (new_stack.isEmpty()) {
//                    break;  // this statement breaks the control and make it go out of loop
//                } else {
//                    new_stack.pop();
//                }
//            }
//        }
//        if(new_stack.isEmpty())
//            System.out.println("balanced");
//        else
//            System.out.println("unbalanced");
//
//    }
//    public static void main(String[] args) {
//        Stack<Character> new_stack=new Stack<>();
//        Scanner in=new Scanner(System.in);
//        String inputString=in.nextLine();
//        for(int k=0;k<inputString.length();k++) {
//            if (inputString.charAt(k) == ')') {
//                new_stack.push(inputString.charAt(k));
//            }
//            if (inputString.charAt(k) == '(') {
//                if (new_stack.isEmpty()) {
//                    break; // this statement breaks the control and make it go out of loop
//                } else {
//                    new_stack.pop();
//                }
//            }
//        }
//        if(new_stack.isEmpty())
//            System.out.println("balanced");
//        else
//            System.out.println("unbalanced");
//    }
//    public static void main(String[] args) {
//        Stack<Character> stack=new Stack<>();
//        Scanner in=new Scanner(System.in);
//        String inputString=in.nextLine();
//        for(int k=1;k<inputString.length()-1;k++) {
//            stack.push(inputString.charAt(k+1));
//            if(inputString.charAt(k+1)==')'&& !stack.isEmpty())
//                stack.pop();
//            if(inputString.charAt(k-1)=='(' && !stack.isEmpty())
//                stack.pop();
//        }
//        while (!stack.isEmpty()){
//            System.out.print(stack.peek());
//            stack.pop();
//        }
//    }
    public static void main(String[] args) {
        Stack<Character> stack=new Stack<>();
        Scanner in=new Scanner(System.in);
        String inputString=in.nextLine();
        for(int k=1;k<inputString.length()-1;k++) {
            stack.push(inputString.charAt(k+1));
            if(inputString.charAt(k+1)==')'&& !stack.isEmpty())
                stack.pop();
            if(inputString.charAt(k-1)=='(' && !stack.isEmpty())
                stack.pop();
        }
        while (!stack.isEmpty()){
            System.out.print(stack.peek());
            stack.pop();
        }
    }
}
