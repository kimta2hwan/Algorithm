import java.io.*;
import java.util.StringTokenizer;

public class Basic1098 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        int[][] table = new int[h][w];
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int[] stock = new int[4];

            for (int j = 0; j < 4; j++) {
                stock[j] = Integer.parseInt(st.nextToken());
            }

            if (stock[1] == 0) {
                for (int j = stock[3] - 1; j < stock[3] + stock[0] - 1; j++) {
                    table[stock[2] - 1][j] = 1;
                }
            } else {
                for (int j = stock[2] - 1; j < stock[2] + stock[0] - 1; j++) {
                    table[j][stock[3] - 1] = 1;
                }
            }
        }
        
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
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