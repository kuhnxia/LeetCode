import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Lc423_1 {
    public String originalDigits(String s) {
        Map<Character, Integer> count = new HashMap<>();
        char[] sc = s.toCharArray();
        for (char c : sc) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        char[][] sc1 = {{'z', '0'}, {'w', '2'}, {'u', '4'}, {'x', '6'}, {'g', '8'}, {'o', '1'}, {'t', '3'}, {'f', '5'}, {'s', '7'}, {'i', '9'}};
        String[] s1 = {"zero", "two", "four", "six", "eight", "one", "three", "five", "seven", "nine"};

        String origin = "";
        for (int i = 0; i < sc1.length; i++) {
            char c = sc1[i][0];
            if (count.get(c) != null && count.get(c) > 0) {
                int number = count.get(c);
                for (int j = 0; j < number; j++) {
                    origin += sc1[i][1];
                }
                for (int j = 0; j < s1[i].length(); j++) {
                    char ch = s1[i].charAt(j);
                    count.put(ch, count.get(ch) - number);
                }
            }
        }
        char[] ans = origin.toCharArray();
        Arrays.sort(ans);
        return new String(ans);
    }
}
