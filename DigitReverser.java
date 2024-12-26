public class DigitReverser {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);        // original integer

        // reverse using arithmetic
        int m = 0;
        while (n != 0) {
            m = (10 * m) + (n % 10);
            n = n / 10;
        }
        System.out.println(m);


        // reverse again using string concatenation
        String s = "";
        while (m != 0) {
            int digit = m % 10;
            s = s + digit;
            m = m / 10;
        }
        System.out.println(s);

    }
}
