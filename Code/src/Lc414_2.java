public class Lc414_2 {
    public int thirdMax(int[] nums) {
        long max1 = Long.MIN_VALUE,max2 = Long.MIN_VALUE,max3 = Long.MIN_VALUE;
        for(int num:nums){
            if(max1 == num || max2 == num || max3==num)
                continue;
            if(num>max1){
                max3 = max2;
                max2 = max1;
                max1 = num;
            }
            else if(num>max2){
                max3 = max2;
                max2 = num;
            }
            else if(num>max3){
                max3 = num;
            }
        }
        return  (int) (max3 == Long.MIN_VALUE? max1:max3);

    }
}
