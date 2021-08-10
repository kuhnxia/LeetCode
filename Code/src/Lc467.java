public class Lc467 {
    public int findSubstringInWraproundString(String p) {
        int[] length = new int[26];
        char[] pc = p.toCharArray();
        int count = 1;
        for(int i=0; i<pc.length; i++){
            if(i>0 && (pc[i]-pc[i-1] == 1 || pc[i]-pc[i-1] == -25)){
                count++;
            }
            else{
                count = 1;
            }
            length[pc[i]-'a'] = Math.max(length[pc[i]-'a'], count);
        }
        int ans = 0;
        for(int l: length){
            ans += l;
        }
        return ans;
    }
}
