import java.io.*;

public class Basic1024 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            sb.append("\'");
            sb.append(str.charAt(i));
            sb.append("\'\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}