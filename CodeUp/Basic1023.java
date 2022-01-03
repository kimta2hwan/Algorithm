import java.io.*;
import java.util.StringTokenizer;

public class Basic1023 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), ".");
        StringBuilder sb = new StringBuilder();

        sb.append(st.nextToken());
        sb.append("\n");
        sb.append(st.nextToken());

        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}