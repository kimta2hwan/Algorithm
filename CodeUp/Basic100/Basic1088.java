import java.io.*;

public class Basic1088 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine()) + 1;

        for (int i = 1; i < a; i++) {
            if (i % 3 == 0) continue;

            sb.append(i);
            sb.append(" ");
        }

        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
    }
}