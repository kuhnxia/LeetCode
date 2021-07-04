public class Lc283_1 {
    public void moveZeroes(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(i == nums.length-1-count)
                break;

            if(nums[i] == 0){
                count++;
                for(int j=i; j<nums.length-1; j++){
                    nums[j] = nums[j+1];
                }
                i--;
            }
        }

        for(int i=nums.length-count; i<nums.length; i++){
            nums[i] = 0;
        }
    }
}
