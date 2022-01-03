import java.io.*;
import java.util.StringTokenizer;

public class Basic1091 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long[] a = new long[4];

        for (int i = 0; i < 4; i++) {
            a[i] = Long.parseLong(st.nextToken());
        }

        for (int i = 0; i < a[3] - 1; i++) {
            a[0] *= a[1];
            a[0] += a[2];
        }

        bw.write(String.valueOf(a[0]));

        bw.flush();
        bw.close();
    }
}