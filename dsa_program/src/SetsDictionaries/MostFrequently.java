package SetsDictionaries;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MostFrequently {
    public static void main(String[] x) {
        String words[] = {"cats", "and", "dogs", "friends", "I", "like", "dogs", "dogs", "cats"};
        findMaxFrequencyWord(words);
    }

    public  static void findMaxFrequencyWord(String[] words){
        HashMap<String, Integer> wordFrequencyMap = new HashMap<String, Integer>();
        for(int i=0;i< words.length; i++){
            if(wordFrequencyMap.containsKey(words[i])){
                wordFrequencyMap.put(words[i], wordFrequencyMap.get(words[i]+1));
            } else{
                wordFrequencyMap.put(words[i], 1);
            }
        }

        Set<Map.Entry<String, Integer>> entrySet = wordFrequencyMap.entrySet();
        String maxFrequencyWord ="";
        int maxCount = 0;

        for(Map.Entry<String, Integer> entry : entrySet){
            if(entry.getValue() > maxCount){
                maxCount = entry.getValue();
                maxFrequencyWord = entry.getKey();
            }
        }

        System.out.println("word with max frequency is" +maxFrequencyWord);
    }
}