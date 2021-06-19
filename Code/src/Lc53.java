import java.util.Scanner;

public class Lc53 {
    public int maxSubArray(int[] nums) {
        boolean allNegative = true;
        for(int i= 0; i<nums.length; i++){
            if(nums[i] > 0){
                allNegative = false;
                break;
            }
        }
        if(allNegative){
            int max = nums[0];
            for(int n: nums){
                if(n > max){
                    max = n;
                }
            }
            return max;
        }
        else{
            int sum = 0;
            int max = 0;
            for(int i = 0; i<nums.length; i++){
                sum += nums[i];

                if(sum >max){
                    max = sum;
                }
                if(sum < 0 ){
                    sum = 0;
                    continue;
                }
            }
            return Math.max(sum, max);
        }

    }

}
