import java.io.*;
import java.util.StringTokenizer;

public class Basic1099 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int[][] cage = new int[10][10];

        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < 10; j++) {
                cage[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int x = 1;
        int y = 1;

        while (true) {
            if (cage[x][y] == 2 || (x == 8 && y == 8)) {
                cage[x][y] = 9;
                break;
            }

            cage[x][y] = 9;

            if (cage[x][y + 1] == 1) x++;
            else y++;
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                sb.append(cage[i][j]);
                sb.append(" ");
            }

            sb.append("\n");
        }

        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
    }
}