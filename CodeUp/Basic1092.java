import java.io.*;
import java.util.StringTokenizer;

public class Basic1092 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] a = new int[3];
        int day = 1;

        for (int i = 0; i < 3; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        while (day % a[0] != 0 || day % a[1] != 0 || day % a[2] !=0) day++;

        bw.write(String.valueOf(day));

        bw.flush();
        bw.close();
    }
}