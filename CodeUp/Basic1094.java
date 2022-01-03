import java.io.*;
import java.util.StringTokenizer;

public class Basic1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        int[] a = new int[T];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < T; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = T - 1; i > -1; i--) {
            sb.append(a[i]);
            sb.append(" ");
        }

        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
    }
}