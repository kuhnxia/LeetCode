public class Lc537 {
    public String complexNumberMultiply(String num1, String num2) {
        String[] mult1 = num1.split("\\+");
        String[] mult2 = num2.split("\\+");
        mult1[1] = mult1[1].substring(0, mult1[1].length()-1);
        mult2[1] = mult2[1].substring(0, mult2[1].length()-1);
        int a1 = Integer.parseInt(mult1[0]);
        int a2 = Integer.parseInt(mult1[1]);
        int b1 = Integer.parseInt(mult2[0]);
        int b2 = Integer.parseInt(mult2[1]);
        StringBuilder result = new StringBuilder();
        result.append(a1*b1-a2*b2);
        result.append('+');
        result.append(a1*b2+b1*a2);
        result.append('i');
        return result.toString();
    }
}
