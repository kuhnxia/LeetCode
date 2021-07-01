public class Lc665_1 {
    public boolean checkPossibility(int[] nums) {
        int n = nums.length;
        int[] nums1 = new int[n];
        int[] nums2 = new int[n];
        for(int i= 0; i<n; i++ ){
            nums1[i] = nums[i];
            nums2[i] = nums[i];
        }
        for(int i= 0; i<n-1; i++){
            if(nums[i]>nums[i+1]){
                nums1[i] = nums1[i+1];
                nums2[i+1] = nums2[i];
                break;
            }
        }

        boolean x = true;
        boolean y = true;

        for(int i = 0; i<n-1; i++){
            if(nums1[i]>nums1[i+1])
                x = false;
            if(nums2[i]>nums2[i+1])
                y = false;
        }
        return x || y;

    }
}
