public class Lc28 {
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();

        if(n==0)
            return 0;

        for(int i=0;i<m;i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                if(m-i>=n){
                    for(int j=0; j<n; j++){
                        if(haystack.charAt(j+i) != needle.charAt(j))
                            break;
                        if(j==n-1)
                            return i;
                    }
                }

            }
        }
        return -1;
    }
}
