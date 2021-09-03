public class Lc273 {
    public String numberToWords(int num) {
        if(num == 0) return "Zero";
        StringBuilder words = new StringBuilder();
        String[] d = {"Billion ", "Million ", "Thousand ", "Hundred "};
        String[] c = {"", "", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "};
        String[] b = {"Ten ", "Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen "};
        String[] a = {"", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine "};
        int[] n ={1000000000, 100000000, 10000000, 1000000, 100000, 10000, 1000, 100, 10, 1};
        int m = 0;
        int x = 0;
        int y = 0;
        for(int i=0; i<n.length; i++){
            m = num/n[i];
            if(i%3 == 0){
                if(i != 0 && x == 1){
                    words.append(b[m]);
                }
                else{
                    words.append(a[m]);
                }
                if(i != 9 && (m != 0 || x != 0 || y != 0))
                    words.append(d[i/3]);
            }
            else if(i%3 == 1){
                words.append(a[m]);
                if(m != 0)
                    words.append(d[3]);
            }
            else{
                words.append(c[m]);
            }
            y = x;
            x = m;
            num %= n[i];
        }
        words.delete(words.length()-1, words.length());
        return words.toString();

    }
}
