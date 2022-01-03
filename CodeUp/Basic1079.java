import java.io.*;
import java.util.StringTokenizer;

public class Basic1079 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        while (st.hasMoreTokens()) {
            String s = st.nextToken();

            bw.write(s);
            bw.newLine();

            if (s.equals("q")) break;
        }

        bw.flush();
        bw.close();
    }
}