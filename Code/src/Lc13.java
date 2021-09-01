import java.util.HashMap;
import java.util.Map;

public class Lc13 {
    public int romanToInt(String s) {
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        int n = 0;
        for(int i=0; i<s.length(); i++){
            int v1 = roman.get(s.charAt(i));
            n += v1;
            if(i>0){
                int v2 = roman.get(s.charAt(i-1));
                if(v1 > v2){
                    n -= 2*v2;
                }
            }
        }
        return n;
    }
}
