package SetsDictionaries;
import java.util.*;
public class test {
   /* public static void main(String args[]) {
        HashMap<Character, Integer> h = new HashMap<Character, Integer>();
        h.put('a', 3);
        h.put('b', 2);
        System.out.print(h.containsKey('a') + " ");
        System.out.print(h.get('a') + " ");
        h.remove('a');
        System.out.print(h.containsKey('a') + " ");
        h.clear();
        System.out.print(h.isEmpty() + " ");
    }*/
   public static void main(String args[]) {
       // create a TreeSet named "tSet"
       TreeSet tSet = new TreeSet();

       // adding elements to it
       tSet.add("4");
       tSet.add("2");
       tSet.add("7");
       tSet.add("5");
       tSet.add("9");

       // printing the TreeSet
       System.out.println(tSet);
   }
}

