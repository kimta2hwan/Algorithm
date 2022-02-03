import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class P9465BU {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = read();

        for (int i = 0; i < T; i++) {
            int n = read();
            int sticker[][] = new int[2][n + 1];
            int dp[][] = new int[2][n + 1];

            for (int j = 0; j < 2; j++) {
                for (int k = 1; k <= n; k++) {
                    sticker[j][k] = read();
                }
            }

            dp[0][1] = sticker[0][1];
            dp[1][1] = sticker[1][1];

            for (int j = 2; j <= n; j++) {
                dp[0][j] = max(dp[1][j - 2], dp[1][j - 1]) + sticker[0][j];
                dp[1][j] = max(dp[0][j - 2],dp[0][j - 1]) + sticker[1][j];
            }

            bw.write(max(dp[0][n], dp[1][n]) + "\n");
        }

        bw.flush();
        bw.close();
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