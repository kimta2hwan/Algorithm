import java.io.*;

public class Basic1041 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = br.read() + 1;

        bw.write((char)a);

        bw.flush();
        bw.close();
    }
}