import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lc49_1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagrams = new ArrayList<List<String>>();
        for(String str: strs){

            char[] sort  = str.toCharArray();
            Arrays.sort(sort);
            String sortStr = new String(sort);

            boolean isAnagram = false;

            for(List anagram: anagrams){
                if(anagram.get(0).equals(sortStr)){
                    anagram.add(str);
                    isAnagram = true;
                    break;
                }
            }
            if(!isAnagram){
                List<String> anagram = new ArrayList<String>();
                anagram.add(sortStr);
                anagram.add(str);
                anagrams.add(anagram);
            }
        }
        for(List anagram: anagrams){
            anagram.remove(0);
        }
        return anagrams;
    }
}
