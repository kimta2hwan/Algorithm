public class P2609 {
    public static void main(String[] args) throws Exception {
        int A = read();
        int B = read();

        StringBuilder sb = new StringBuilder();

        sb.append(gcd(A, B)).append('\n').append(lcm(A, B));

        System.out.print(sb);
    }

    static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }

        return gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    private static int read() throws Exception {
        int c, n = System.in.read() & 15;

        while ((c = System.in.read()) > 32) {
            n = (n << 3) + (n << 1) + (c & 15);
        }

        if (c == 13) {
            System.in.read();
        }

        return n;
    }
}