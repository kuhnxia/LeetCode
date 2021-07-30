import java.util.HashMap;
import java.util.Map;

public class Lc387 {
    public int firstUniqChar(String s) {
        //Map<Character, Integer> ch = new HashMap<>();
        Map<Character, Integer> count = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char letter = s.charAt(i);
            //ch.put(letter, i);
            if(count.get(letter) == null){
                count.put(letter, 1);
            }
            else{
                int j = count.get(letter) + 1;
                count.put(letter, j);
            }
        }
        for(int i=0; i< s.length(); i++){
            if(count.get(s.charAt(i)) == 1)
                return i;
        }
        /*
        for(Character key:count.keySet()){
            if(count.get(key) == 1)
                return ch.get(key);

        }
        */
        return -1;
    }
}
