import java.io.*;
import java.util.StringTokenizer;

public class Basic1093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        int[] a = new int[23];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < T; i++) {
            a[Integer.parseInt(st.nextToken()) - 1]++;
        }

        for (int i = 0; i < 23; i++) {
            sb.append(a[i]);
            sb.append(" ");
        }

        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
    }
}