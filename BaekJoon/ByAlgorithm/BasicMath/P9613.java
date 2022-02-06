public class P9613 {
    public static void main(String[] args) throws Exception {
        int T = read();

        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            int n = read();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = read();
            }

            long sum = 0;

            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    sum += gcd(arr[i], arr[j]);
                }
            }

            sb.append(sum).append('\n');
        }

        System.out.print(sb);
    }

    private static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }

        return gcd(b, a % b);
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
