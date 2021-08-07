import java.util.HashMap;
import java.util.Map;

public class Lc423false {
    public String originalDigits(String s) {
        Map<Character, Integer> count = new HashMap<>();
        char[] sc = s.toCharArray();
        for(char c: sc){
            count.put(c, count.getOrDefault(c, 0)+1);
        }

        String[] numbers = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String origin = "";
        for(int i=0; i<numbers.length;i++){
            boolean isExist = true;
            while(isExist){
                int j;
                for(j=0; j<numbers[i].length(); j++){
                    char c = numbers[i].charAt(j);
                    if(count.get(c) == null || count.get(c) < 1){
                        isExist = false;
                        break;
                    }
                }
                if(j == numbers[i].length()){
                    origin += i;
                    for(j=0; j<numbers[i].length(); j++){
                        char c = numbers[i].charAt(j);
                        count.put(c, count.get(c)-1);
                    }
                }
            }
        }
        return origin;
    }
}
