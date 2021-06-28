import java.util.Arrays;

public class Lc274_1 {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        for(int i= 0; i < n; i++){
            if(citations[i] > n-1-i){
                return n-i;
            }
        }
        return 0;

    }
}
