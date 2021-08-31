package Debug;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class D387 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Map count = firstUniqChar(s);
        for(Object key:count.keySet()){
           System.out.println(key);
        }
        /*
        input: leetcode
        output: ctdelo
        所以如果存在重复的key，keyset的顺序会被打乱；
         */

    }
    public static Map firstUniqChar(String s) {
        Map<Character, Integer> ch = new HashMap<>();
        Map<Character, Integer> count = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char letter = s.charAt(i);
            ch.put(letter, i);
            if(count.get(letter) == null){
                count.put(letter, 1);
            }
            else{
                int j = count.get(letter) + 1;
                count.put(letter, j);
            }
        }
        /*
        for(int i=0; i< s.length(); i++){
            if(count.get(s.charAt(i)) == 1)
                return i;
        }
        */
        /*
        for(Character key:count.keySet()){
            if(count.get(key) == 1)
                return ch.get(key);

        }
         */
        return ch;
    }
}
