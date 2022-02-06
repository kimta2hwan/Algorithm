public class P1934 {
    public static void main(String[] args) throws Exception {
        int T = read();

        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            sb.append(lcm(read(), read())).append('\n');
        }

        System.out.print(sb);
    }

    private static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }

        return gcd(b, a % b);
    }

    private static int lcm(int a, int b) {
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