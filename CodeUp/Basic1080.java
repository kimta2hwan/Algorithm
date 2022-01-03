import java.io.*;

public class Basic1080 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int i = 1;
        int sum = 0;

        while (true) {
            sum += i;

            if (sum >= num) {
                bw.write(String.valueOf(i));
                break;
            }

            i++;
        }

        bw.flush();
        bw.close();
    }
}