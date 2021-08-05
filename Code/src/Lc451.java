import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lc451 {
    public String frequencySort(String s) {
        List<List<Character>> lists = new ArrayList<>();
        char[] str = s.toCharArray();
        Arrays.sort(str);
        int i = 0;
        while(i< str.length){
            int j = i+1;
            while(j < str.length && str[j] == str[j-1]){
                j++;
            }
            if(j-i > lists.size()){
                for(int x = lists.size(); x < j-i; x++){
                    List<Character> list = new ArrayList<>();
                    lists.add(list);
                }
            }
            lists.get(j-i-1).add(str[j-1]);
            i = j;
        }
        String frequency = "";
        for(int a = lists.size()-1; a>-1; a--){
            for(int b=0; b<lists.get(a).size(); b++){
                for(int c=0; c<a+1; c++){
                    frequency += lists.get(a).get(b);
                }
            }
        }
        return frequency;
    }
}
