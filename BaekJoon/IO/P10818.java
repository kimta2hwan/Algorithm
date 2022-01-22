import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class P10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int val;

        int max = -1000001;
        int min = 1000001;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            val = Integer.parseInt(st.nextToken());

            if (val < min) {
                min = val;
            }
            
            if (val > max) {
                max = val;
            }
        }

        sb.append(min);
        sb.append(" ");
        sb.append(max);

        bw.write(String.valueOf(sb));
        bw.flush();
        
        br.close();
        bw.close();
    }
}