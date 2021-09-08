package Debug;

public class D8 {
    public static void main(String[] args) {
        long s = 50;
        int i = (int)s;
        System.out.println(i);

        StringBuilder a = new StringBuilder();
        a.append(123);
        a.insert(0,'-');
        System.out.println(a.toString());
        System.out.println(a.toString());

    }
}
