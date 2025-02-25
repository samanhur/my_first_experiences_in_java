public class Tamrin3 {
    public static void main(String[] args) {
        int a = -15;
        int b = 70;
        final double pi = 3.141592653589793d;

        //Step 1
        a = ~a + 1;

        //Step 2
        a *= 2;

        //Step 3
        double area = pi * a * a;

        //Step 4
        b /= 2;

        //Step 5 (printing result)
        System.out.println(area + b);
    }
}
