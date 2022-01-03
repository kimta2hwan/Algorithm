import java.io.*;

public class Basic1077 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num + 1; i++) {
            bw.write(String.valueOf(i));
            bw.newLine();
        }
        
        bw.flush();
        bw.close();
    }
}