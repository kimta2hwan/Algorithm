public class P1850 {
    public static void main(String[] args) throws Exception {
        System.out.print("1".repeat((int)gcd(read(), read())));
    }

    private static long gcd(long a, long b) {
        if (a % b == 0) {
            return b;
        }

        return gcd(b, a % b);
    }

    private static long read() throws Exception {
        long c, n = System.in.read() & 15;

        while ((c = System.in.read()) > 32) {
            n = (n << 3) + (n << 1) + (c & 15);
        }

        if (c == 13) {
            System.in.read();
        }

        return n;
    }
}