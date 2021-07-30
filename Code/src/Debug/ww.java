package Debug;

public class ww {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 100; j++) {
                if (j == 100)
                    break;
                ;
            }
            a++;
        }
        System.out.println(a);
    }
}
