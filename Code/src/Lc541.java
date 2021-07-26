public class Lc541 {
    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        int i;
        int a;
        int b;
        for(i=1; 2*k*i < s.length(); i++){
            a = 2*k*(i-1);
            b = 2*k*i-k-1;
            reverse(ch,a,b);
        }
        i--;
        if(s.length()-2*k*i >= k){
            a = 2*k*i;
            b = 2*k*i+k-1;
            reverse(ch,a,b);
        }
        else{
            a = 2*k*i;
            b = s.length()-1;
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
