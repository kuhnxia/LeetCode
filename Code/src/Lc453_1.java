import java.util.Arrays;

public class Lc453_1 {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int sum = 0;
        for(int i= 0; i<n-1; i++){
            sum += (nums[i+1]-nums[i])*(n-i-1);
        }
        return sum;

    }
}
