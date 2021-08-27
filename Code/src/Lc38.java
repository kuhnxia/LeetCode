public class Lc38 {
    public String countAndSay(int n) {
        String s = "1";
        for(int i=1; i<n; i++){
            StringBuilder say = new StringBuilder();
            int count = 0;
            for(int j = 0; j<s.length();j++){
                if(j==0 && j==s.length()-1){
                    count++;
                    say.append(count);
                    say.append(s);
                }
                else if(j==0){
                    count++;
                }
                else{
                    if(s.charAt(j)==s.charAt(j-1)){
                        count++;
                    }
                    else{
                        say.append(count);
                        say.append(s.charAt(j-1));
                        count=1;
                    }
                    if(j==s.length()-1){
                        say.append(count);
                        say.append(s.charAt(j));
                    }
                }
            }
            s = new String(say);
        }
        return s;
    }
}
