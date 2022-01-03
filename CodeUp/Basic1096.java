import java.io.*;
import java.util.StringTokenizer;

public class Basic1096 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] table = new int[19][19];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            table[Integer.parseInt(st.nextToken()) - 1][Integer.parseInt(st.nextToken()) - 1] = 1;
        }

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                sb.append(table[i][j]);
                sb.append(" ");
            }
            sb.append("\n");
        }

        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
    }
}