import java.io.*;

public class Basic1074 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        while (count != 0) {
            bw.write(String.valueOf(count));
            bw.newLine();
            count--;
        }

        bw.flush();
        bw.close();
    }
}