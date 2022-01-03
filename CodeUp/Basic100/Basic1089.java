import java.io.*;
import java.util.StringTokenizer;

public class Basic1089 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] a = new int[3];

        for (int i = 0; i < 3; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        bw.write(String.valueOf(a[0] + a[1] * (a[2] - 1)));

        bw.flush();
        bw.close();
    }
}