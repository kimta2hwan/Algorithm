import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P9095TD {
    static int[] dp = new int[11];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int n;

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 0; i < T; i++) {
            n = Integer.parseInt(br.readLine());

            sb.append(count(n));
            sb.append('\n');
        }

        bw.write(String.valueOf(sb));
        bw.flush();

        br.close();
        bw.close();
    }

    static int count(int n) {
        if (dp[n] > 0) {
            return dp[n];
        } else {
            dp[n] = count(n - 3) + count(n - 2) + count(n - 1);
        }

        return dp[n];
    }
}