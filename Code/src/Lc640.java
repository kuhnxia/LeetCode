import java.util.ArrayList;
import java.util.List;

public class Lc640 {
    public String solveEquation(String equation) {
        int[] left = simply(equation.split("=")[0]);
        int[] right = simply(equation.split("=")[1]);
        if(left[0]-right[0] == 0 && left[1]-right[1] == 0){
            return "Infinite solutions";
        }
        else if(left[1]-right[1] == 0){
            return "No solution";
        }
        else{
            int result = (right[0]-left[0])/(left[1]-right[1]);
            return "x="+ result;
        }
    }
    public int[] simply(String s){
        List<Character> sign = new ArrayList<>();
        if(s.charAt(0) != '-')
            sign.add('+');
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '+' || s.charAt(i) == '-')
                sign.add(s.charAt(i));
        }
        int num = 0;
        int x = 0;
        String[] divid = s.split("\\+|-");
        List<String> items = new ArrayList<>();
        for(String item: divid){
            if(item.length()>0)
                items.add(item);
        }
        for(int i=0; i<items.size(); i++){
            String ss = items.get(i);
            if(ss.charAt(ss.length()-1) != 'x'){
                if(sign.get(i) == '+'){
                    num += Integer.parseInt(ss);
                }
                else{
                    num -= Integer.parseInt(ss);
                }
            }
            else if(ss.charAt(0) == 'x'){
                if(sign.get(i) == '+'){
                    x++;
                }
                else{
                    x--;
                }
            }
            else{
                if(sign.get(i) == '+'){
                    x += Integer.parseInt(ss.substring(0, ss.length()-1));
                }
                else{
                    x -= Integer.parseInt(ss.substring(0, ss.length()-1));
                }
            }

        }
        int[] parts = {num, x};
        return parts;
    }
}
