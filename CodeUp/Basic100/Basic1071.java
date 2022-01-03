import java.io.*;
import java.util.StringTokenizer;

public class Basic1071 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (true) {
            String num = st.nextToken();

            if (num.equals("0")) break;

            bw.write(num);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}