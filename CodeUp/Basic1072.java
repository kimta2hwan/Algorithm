import java.io.*;
import java.util.StringTokenizer;

public class Basic1072 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        br.readLine();
        st = new StringTokenizer(br.readLine(), " ");

        while (st.hasMoreTokens()) {
            bw.write(st.nextToken());
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}