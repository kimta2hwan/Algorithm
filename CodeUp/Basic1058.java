import java.io.*;
import java.util.StringTokenizer;

public class Basic1058 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf(a == 0 && b == 0 ? 1 : 0));

        bw.flush();
        bw.close();
    }
}