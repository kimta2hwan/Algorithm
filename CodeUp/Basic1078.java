import java.io.*;

public class Basic1078 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 1; i < num + 1; i++) {
            if (i % 2 == 0) sum += i;
        }
        
        bw.write(String.valueOf(sum));

        bw.flush();
        bw.close();
    }
}