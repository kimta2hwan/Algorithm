import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(count(N, 0)));

        br.close();
        bw.close();
    }

    public static int count(int n, int count) {
        if (n < 2) {
            return count;
        }

        return Math.min(count(n / 2, count + (n % 2) + 1), count(n / 3, count + (n % 3) + 1));
    }
}