import java.io.*;

public class Basic1025 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            sb.append("[");
            sb.append(str.charAt(i));

            if (i != str.length() - 1) {
                for (int j = str.length() - i - 1; j > 0; j--) {
                    sb.append("0");
                }
            }

            sb.append("]\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}