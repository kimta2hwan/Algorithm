import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P10992 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N - 1; i++) {
            for (int j = i; j < N - 1; j++) {
                sb.append(' ');
            }

            sb.append('*');

            for (int j = 0; j < i * 2 - 1; j++) {
                sb.append(' ');
            }

            if (i != 0) {
                sb.append('*');
            }

            sb.append('\n');
        }

        for (int i = 0; i < N * 2 - 1; i++) {
            sb.append('*');
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        
        br.close();
        bw.close();
    }
}