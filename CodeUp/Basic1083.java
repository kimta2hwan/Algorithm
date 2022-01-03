import java.io.*;

public class Basic1083 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i < num + 1; i++) {
            if (i == 3 || i == 6 || i == 9) sb.append("X");
            else sb.append(i);
            sb.append(" ");
        }

        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
    }
}