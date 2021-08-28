public class Lc38_1 {
    public String countAndSay(int n) {
        if(n==1) return "1";
        StringBuilder ans = new StringBuilder();
        String lastStr = countAndSay(n-1);
        int i = 0;
        int j = 1;
        while(j<lastStr.length()){
            if(lastStr.charAt(j) != lastStr.charAt(i)){
                ans.append(j-i);
                ans.append(lastStr.charAt(i));
                i=j;
            }
            j++;
        }
        ans.append(j-i);
        ans.append(lastStr.charAt(i));
        return ans.toString();
    }
}
