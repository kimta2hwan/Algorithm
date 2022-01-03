import java.io.*;
import java.util.StringTokenizer;

public class Basic1081 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for (int i = 1; i < a + 1; i++) {
            for (int j = 1; j < b + 1; j++) {
                sb.append(i);
                sb.append(" ");
                sb.append(j);
                sb.append("\n");
            }
        }

        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
    }
}