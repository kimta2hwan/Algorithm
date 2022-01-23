import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P2522 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            sb.append(' ');
        }

        for (int i = N; i > 0; i--) {
            sb.setCharAt(i - 1, '*');
            bw.write(String.valueOf(sb));
            bw.newLine();
        }

        for (int i = 0; i < N - 1; i++) {
            sb.setCharAt(i, ' ');
            bw.write(String.valueOf(sb));
            bw.newLine();
        }

        bw.flush();
        
        br.close();
        bw.close();
    }
}