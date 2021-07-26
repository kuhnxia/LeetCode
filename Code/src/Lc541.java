public class Lc541 {
    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        for(int i=0; 2*k*i < ch.length; i++){
            int a = 2*k*i;
            int b = Math.min(2*k*i+k-1, ch.length-1);
            reverse(ch,a,b);
        }
        return new String(ch);
    }
    public void reverse (char[] ch, int a, int b){
        while(a<b){
            char temp = ch[a];
            ch[a] = ch[b];
            ch[b] = temp;
            a++;
            b--;
        }
    }
}
