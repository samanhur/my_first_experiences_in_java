public class Tamrin4 {
    public static void main(String[] args) {
        int n = 2025;
        int a; int b; int c; int d;

        a = n % 10;
        b = (n / 10) % 10;
        c = (n / 100) % 10;
        d = (n / 1000) % 10;

        n = a * 1000 + b * 100 + c * 10 + d;

        System.out.println(n);
    }
}
