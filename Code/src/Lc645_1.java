import java.util.Arrays;

public class Lc645_1 {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++){
            if(nums[i]-i != 1){
                if(nums[i]-i == 2){
                    result[1] = i+1;
                }
                if(nums[i]-i == 0){
                    result[0] = nums[i];
                }
                break;
            }
        }

        for(int i= nums.length-1; i>-1; i--){
            if(nums[i]-i != 1){
                if(nums[i]-i == 2){
                    result[0] = nums[i];
                }
                if(nums[i]-i == 0){
                    result[1] = i+1;
                }
                break;
            }
        }
        return result;
    }
}
