public class Lc299 {
    public String getHint(String secret, String guess) {
        char[] s = secret.toCharArray();
        char[] g = guess.toCharArray();
        int[] sc = new int[10];
        int[] gc = new int[10];
        int bulls = 0;
        int cows = 0;
        for(int i=0; i<s.length; i++){
            if(s[i] == g[i]){
                bulls++;
            }
            else{
                sc[s[i]-'0']++;
                gc[g[i]-'0']++;
            }
        }
        for(int i=0; i<sc.length; i++){
            cows += Math.min(sc[i], gc[i]);
        }
        return bulls + "A" + cows + "B";
    }
}
