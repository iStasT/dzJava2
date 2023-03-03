public class Main {
    public static void main(String[] args) {
        int a = 20100;
        int b = 0;

        if (a >= 1000) {
            b = a / 100;
            a = a + b;

        }

        System.out.println(a);


    }
}