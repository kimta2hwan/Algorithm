import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P9095BU {
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

            for (int j = 4; j <= n; j++) {
                dp[j] = dp[j - 3] + dp[j - 2] + dp[j - 1];
            }

            sb.append(dp[n]);
            sb.append('\n');
        }

        bw.write(String.valueOf(sb));
        bw.flush();

        br.close();
        bw.close();
    }
}