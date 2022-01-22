import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            for (int j = 1; j < N - i; j++) {
                sb.append(' ');
            }

            for (int k = 0; k <= i; k++) {
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