import java.io.*;

public class Basic1087 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = Integer.parseInt(br.readLine());
        int sum = 0;
        int i = 1;

        while (sum < max) {
            sum += i;
            i++;
        }

        bw.write(String.valueOf(sum));

        bw.flush();
        bw.close();
    }
}