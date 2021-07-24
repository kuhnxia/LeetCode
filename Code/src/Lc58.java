public class Lc58 {
    public int lengthOfLastWord(String s) {
        int i = s.length()-1;
        while(i>-1 && s.charAt(i) == ' '){
            i--;
        }
        int count = 0;
        while(i>-1 && s.charAt(i) != ' '){
            count++;
            i--;

        }
        return count;
    }
}
