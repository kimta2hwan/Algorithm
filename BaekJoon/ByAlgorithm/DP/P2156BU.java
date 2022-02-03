import java.io.IOException;

public class P2156BU {
    public static void main(String[] args) throws IOException {
        int n = read();
        int wine[] = new int[n + 1];
        int dp[] = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            wine[i] = read();
        }

        dp[1] = wine[1];

        if (n > 1) {
            dp[2] = wine[1] + wine[2];
        }

        for (int i = 3; i <= n; i++) {
            dp[i] = max(dp[i - 1], max(dp[i - 2] + wine[i], dp[i - 3] + wine[i - 1] + wine[i]));
        }

        System.out.println(dp[n]);
    }

    static int max(int a, int b) {
        return a > b ? a : b;
    }

    static int read() throws IOException {
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