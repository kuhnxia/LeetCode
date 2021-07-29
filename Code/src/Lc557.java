public class Lc557 {
    public String reverseWords(String s) {
        char[] ch = s.toCharArray();
        int i = 0;
        int j = 0;
        while(j<ch.length){
            while(ch[j] != ' ' && j < ch.length-1){
                j++;
            }
            if(j == ch.length-1){
                reverse(ch, i, j);
            }
            else{
                reverse(ch, i, j-1);
            }
            j++;
            i=j;
        }
        return new String(ch);
    }
    public void reverse (char[] ch, int a, int b){
        while(a<b){
            char temp = ch[a];
            ch[a++] = ch[b];
            ch[b--] = temp;
        }
    }
}
