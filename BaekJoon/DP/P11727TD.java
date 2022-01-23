import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P11727TD {
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        dp = new int[n + 2];
        dp[1] = 1;
        dp[2] = 3;

        bw.write(String.valueOf(count(n)));

        br.close();
        bw.close();
    }

    static int count(int n) {
        if (dp[n] > 0) {
            return dp[n];
        } else {
            dp[n] = (count(n - 1) + 2 * count(n - 2)) % 10007;
        }

        return dp[n];
    }
}