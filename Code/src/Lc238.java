public class Lc238 {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int product = 1;
        for(int i=0; i<nums.length; i++){
            answer[i] = product;
            product *= nums[i];
        }
        product = 1;
        for(int j=nums.length-1; j>-1; j--){
            answer[j] = answer[j] * product;
            product *= nums[j];
        }
        return answer;
    }
}
