import java.io.*;

public class Basic1044 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long a = Long.valueOf(br.readLine());

        bw.write(String.valueOf(a + 1));

        bw.flush();
        bw.close();
    }
}