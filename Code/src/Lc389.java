import java.util.HashMap;
import java.util.Map;

public class Lc389 {
    public char findTheDifference1(String s, String t) {
        int ret = 0;
        for (int i = 0; i < s.length(); ++i) {
            ret ^= s.charAt(i);
        }
        for (int i = 0; i < t.length(); ++i) {
            ret ^= t.charAt(i);
        }
        return (char) ret;
    }
    public char findTheDifference2(String s, String t) {
        int as = 0, at = 0;
        for (int i = 0; i < s.length(); ++i) {
            as += s.charAt(i);
        }
        for (int i = 0; i < t.length(); ++i) {
            at += t.charAt(i);
        }
        return (char) (at - as);
    }
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> count = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            count.put(s.charAt(i), count.getOrDefault(s.charAt(i), 0)+1);
            count.put(t.charAt(i), count.getOrDefault(t.charAt(i), 0)+1);
        }
        count.put(t.charAt(s.length()), count.getOrDefault(t.charAt(s.length()), 0)+1);
        for(int i=0; i<t.length(); i++){
            if(count.get(t.charAt(i))%2 == 1)
                return t.charAt(i);
        }
        return '0';
    }
}
