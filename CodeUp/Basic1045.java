import java.io.*;
import java.util.StringTokenizer;

public class Basic1045 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        long c = a + b;
        int d = a - b;
        long e = a * b;
        int f = a / b;
        int g = Math.floorMod(a , b);
        String h = String.format("%.2f", (double) a / b);

        bw.write(String.valueOf(c));
        bw.newLine();
        bw.write(String.valueOf(d));
        bw.newLine();
        bw.write(String.valueOf(e));
        bw.newLine();
        bw.write(String.valueOf(f));
        bw.newLine();
        bw.write(String.valueOf(g));
        bw.newLine();
        bw.write(h);

        bw.flush();
        bw.close();
    }
}