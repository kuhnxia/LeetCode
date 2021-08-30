public class Lc443 {
    public int compress(char[] chars) {
        if(chars.length == 1) return 1;

        int a=0;
        int b=1;
        int c=a;

        while(b<chars.length){
            if(chars[b] != chars[a]){
                chars[c] = chars[a];
                int i = 0;
                if(b-a != 1){
                    String s = Integer.toString(b-a);
                    while(i<s.length()){
                        chars[c+i+1] = s.charAt(i);
                        i++;
                    }
                }
                c += i+1;
                a=b;
            }
            b++;
        }
        chars[c] = chars[a];
        int i = 0;
        if(b-a != 1){
            String s = Integer.toString(b-a);
            while(i<s.length()){
                chars[c+i+1] = s.charAt(i);
                i++;
            }
        }
        c += i+1;
        return c;
    }
}
