import java.util.ArrayList;
import java.util.List;

public class Lc448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] dis = new int[nums.length+1];
        for(int n:nums) dis[n]++;
        for(int i=1; i<dis.length; i++){
            if(dis[i] == 0){
                list.add(i);
            }
        }
        return list;

    }
}
