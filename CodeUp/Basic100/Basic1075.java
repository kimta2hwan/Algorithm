import java.io.*;

public class Basic1075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        while (count != 0) {
            count--;
            bw.write(String.valueOf(count));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}