import java.util.ArrayList;
import java.util.List;

public class Lc49_2 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagrams = new ArrayList<List<String>>();
        for(String str: strs){
            Boolean isTrue = false;
            for(List anagram: anagrams){
                if(isAnagram((String)anagram.get(0), str)){
                    anagram.add(str);
                    isTrue = true;
                    break;
                }
            }
            if(!isTrue){
                List<String> anagram = new ArrayList<String>();
                anagram.add(str);
                anagrams.add(anagram);
            }
        }
        return anagrams;
    }
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int[] count = new int[26];
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i) - 'a']++;
        }
        for(int i=0; i<t.length(); i++){
            int i1 = count[t.charAt(i) - 'a']--;
            if(i1 < 0)
                return false;
        }
        return true;
    }
}
