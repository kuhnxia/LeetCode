public class Lc553 {
    public String optimalDivision(int[] nums) {
        StringBuilder max = new StringBuilder();
        if(nums.length == 1){
            max.append(nums[0]);
            return max.toString();
        }
        if(nums.length == 2){
            max.append(nums[0]);
            max.append('/');
            max.append(nums[1]);
            return max.toString();
        }
        for(int i= 0; i<nums.length; i++){
            max.append(nums[i]);
            if(i == 0){
                max.append("/(");
            }
            else if(i == nums.length-1){
                max.append(')');
            }
            else{
                max.append('/');
            }
        }
        return max.toString();
    }
}
