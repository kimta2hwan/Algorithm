import java.io.*;
import java.util.StringTokenizer;

public class Basic1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        double size = 1 / 8.0 / 1024 / 1024;

        while (st.hasMoreTokens()) size *= Integer.parseInt(st.nextToken());

        sb.append(Math.round(size * 10) / 10.0);
        sb.append(" ");
        sb.append("MB");

        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
    }
}