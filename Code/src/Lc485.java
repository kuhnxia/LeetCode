import java.util.ArrayList;
import java.util.Collections;

class Lc485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int[] tem = nums;
        ArrayList<Integer> sums = new ArrayList<>();
        int sum = 0;
        for(int i=0; i<tem.length; i++){
            if(tem[i] == 1){
                sum++;
                if(i==tem.length-1)
                    sums.add(sum);
            }
            else{
                sums.add(sum);
                sum = 0;
            }
        }
        return Collections.max(sums);
    }
}