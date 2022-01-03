import java.io.*;
import java.util.StringTokenizer;

public class Basic1095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        int min = 23;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < T; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (num < min) min = num;
        }

        bw.write(String.valueOf(min));

        bw.flush();
        bw.close();
    }
}