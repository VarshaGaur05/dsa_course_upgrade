package BST;
import java.util.*;


public class test {
    public static void main(String args[]) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", new Integer(1));
        hashMap.put("B", new Integer(2));
        hashMap.put("C", new Integer(3));
        hashMap.put("A", new Integer(2));
        hashMap.put("C", new Integer(2));
        System.out.println(hashMap.entrySet());
    }
}
