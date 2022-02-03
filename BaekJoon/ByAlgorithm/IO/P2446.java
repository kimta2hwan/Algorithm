import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P2446 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N * 2 - 1; i++) {
            sb.append('*');
        }

        bw.write(String.valueOf(sb));
        bw.newLine();

        for (int i = 0; i < N - 1; i++) {
            sb.setCharAt(i, ' ');
            sb.deleteCharAt(N * 2 - 2 - i);

            bw.write(String.valueOf(sb));
            bw.newLine();
        }

        for (int i = N - 1; i > 0; i--) {
            sb.setCharAt(i - 1, '*');
            sb.append('*');

            bw.write(String.valueOf(sb));
            bw.newLine();
        }

        bw.flush();
        
        br.close();
        bw.close();
    }
}