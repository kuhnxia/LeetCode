package Debug;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D640 {
    public static void main(String[] args) {
        String ss = "-x=-1";
        String s = ss.split("=")[0];
        System.out.println(s);
        List<Character> sign = new ArrayList<>();
        if(s.charAt(0) != '-')
            sign.add('+');
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '+' || s.charAt(i) == '-')
                sign.add(s.charAt(i));
        }
        System.out.println(sign);
        String[] items = s.split("\\+|-");
        for (String sss: items){
            System.out.println(sss);
        }
        String ww = "-3x+5+6-6x+7-5x+3+44x-6x";
        String[] divide = ww.split("\\+|-");
        System.out.println(Arrays.toString(divide));
        System.out.println(divide.length);

        String aa = "-3x+5+6-6x+7-5x+3+44x-6x";
        String[] dd = aa.split("\\+");
        System.out.println(Arrays.toString(dd));
        System.out.println(dd.length);

        String vv = "-3x";
        String[] bb = vv.split("-");
        System.out.println(Arrays.toString(bb));
        System.out.println(bb.length);


    }
}
