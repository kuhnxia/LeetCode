import java.util.Arrays;

public class Lc414 {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n = 1;
        for(int i=nums.length-2; i>-1; i--){

            if(nums[i]<nums[i+1])
                n++;
            if(n==3)
                return nums[i];
        }
        return nums[nums.length-1];
    }
}
