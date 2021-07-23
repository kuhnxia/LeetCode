public class Lc14 {
    public String longestCommonPrefix(String[] strs) {
        String lcp = "";
        if(strs.length == 1){
            lcp = strs[0];
        }
        else{
            for(int i=0; i<200; i++){
                for(int j=0; j<strs.length; j++){
                    if(i>=strs[j].length()){
                        i = 200;
                    }
                    else if(strs[j].charAt(i) - strs[0].charAt(i) != 0){
                        i = 200;
                    }
                }
                if(i<200)
                    lcp += strs[0].charAt(i);
            }
        }
        return lcp;
    }
}
