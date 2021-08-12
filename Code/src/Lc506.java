import java.util.Arrays;
import java.util.HashMap;

public class Lc506 {
    public String[] findRelativeRanks(int[] score) {
        int[] copy = new int[score.length];
        for(int i=0; i<score.length; i++){
            copy[i] = score[i];
        }
        HashMap<Integer, String> rank = new HashMap<>();
        Arrays.sort(copy);
        for(int i=1; i<=copy.length; i++){
            if(i==1){
                rank.put(copy[copy.length-i], "Gold Medal");
            }
            else if(i==2){
                rank.put(copy[copy.length-i], "Silver Medal");
            }
            else if(i==3){
                rank.put(copy[copy.length-i], "Bronze Medal");
            }
            else{
                rank.put(copy[copy.length-i], Integer.toString(i));
            }
        }
        String[] ans = new String[score.length];
        for(int i=0;i<score.length;i++){
            ans[i] = rank.get(score[i]);
        }
        return ans;
    }
}
