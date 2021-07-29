public class Lc151 {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String reverse = "";
        for(int i=words.length-1; i>-1; i--){
            if(words[i].length() != 0)
                reverse += words[i] + " ";
        }
        reverse = reverse.substring(0, reverse.length()-1);
        return reverse;
    }
}
