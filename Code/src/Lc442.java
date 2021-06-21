import java.util.ArrayList;
import java.util.List;

public class Lc442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] count = new int[nums.length+1];
        for(int i=0; i<nums.length; i++){
            count[nums[i]]++;
            if(count[nums[i]] == 2)
                list.add(nums[i]);
        }
        return list;
    }
}
