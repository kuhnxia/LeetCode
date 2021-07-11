public class Lc396 {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int f = 0;
        int sum =0;
        for(int num: nums){
            sum += num;
        }
        for(int i=0; i<n; i++){
            f += nums[i]*i;
        }
        int max = f;
        for(int i = 1; i<n; i++){
            f = f+sum-n*nums[n-i];
            if(f >max){
                max = f;
            }

        }

        return max;

    }
}
