import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2193TD {
    static long dp[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        dp = new long[N + 1];

        System.out.println(count(N));
    }

    static long count(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }

        if (dp[n] > 0) {
            return dp[n];
        }

        dp[n] = count(n - 1) + count(n - 2);

        return dp[n];
    }
}