public class Tamrin2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 7;

        //Swap a with c
        a = a ^ c;
        c = a ^ c;
        a = a ^ c;

        //printing result
        //System.out.println("new a = " + a + " , new c = " + c);

        int result;
        result = a * b * c ^ a * a ^ b + a;
        System.out.println(result);
        result = a * b * (c ^ a) * (a ^ b) + a;
        System.out.println(result);
    }
}
