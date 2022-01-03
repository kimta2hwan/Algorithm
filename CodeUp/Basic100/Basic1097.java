import java.io.*;
import java.util.StringTokenizer;

public class Basic1097 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int[][] table = new int[19][19];

        for (int i = 0; i < 19; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            
            for (int j = 0; j < 19; j++) {
                table[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;

            for (int j = 0; j < 19; j++) {
                if (table[a][j] == 0) table[a][j] = 1;
                else table[a][j] = 0;

                if (table[j][b] == 0) table[j][b] = 1;
                else table[j][b] = 0;
            }
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