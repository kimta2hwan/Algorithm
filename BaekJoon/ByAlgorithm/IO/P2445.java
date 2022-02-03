import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P2445 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i + 1; j++) {
                sb.append('*');
            }

            for (int j = 0; j < N - i - 1; j++) {
                sb.append(' ');
                sb.append(' ');
            }

            for (int j = 0; j < i + 1; j++) {
                sb.append('*');
            }

            sb.append("\n");
        }

        for (int i = N - 1; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                sb.append('*');
            }

            for (int j = 0; j < N - i; j++) {
                sb.append(' ');
                sb.append(' ');
            }

            for (int j = i; j > 0; j--) {
                sb.append('*');
            }

            sb.append("\n");
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        
        br.close();
        bw.close();
    }
}