import java.io.*;

public class Basic1059 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(~a));

        bw.flush();
        bw.close();
    }
}