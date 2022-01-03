import java.io.*;
import java.util.StringTokenizer;

public class Basic1046 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        long d = a + b + c;
        String e = String.format("%.1f", d / 3.0);

        bw.write(String.valueOf(d));
        bw.newLine();
        bw.write(e);

        bw.flush();
        bw.close();
    }
}