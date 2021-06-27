public class Lc88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] sorted = new int[m+n];
        int current;
        int p = 0;
        int q = 0;
        while(p<m || q<n){
            if(p == m){
                current = nums2[q++];
            }
            else if(q == n){
                current = nums1[p++];
            }
            else if(nums1[p] < nums2[q]){
                current = nums1[p++];
            }
            else{
                current = nums2[q++];
            }
            sorted[p+q-1] = current;
        }
        for(int i=0; i<m+n; i++){
            nums1[i] = sorted[i];
        }

    }
}
