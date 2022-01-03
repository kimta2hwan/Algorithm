import java.io.*;

public class Basic1082 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine(), 16);
        String hexNum = Integer.toHexString(num).toUpperCase();

        for (int i = 1; i < 16; i++) {
            sb.append(hexNum);
            sb.append("*");
            sb.append(Integer.toHexString(i).toUpperCase());
            sb.append("=");
            sb.append(Integer.toHexString(num * i).toUpperCase());
            sb.append("\n");
        }

        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
    }
}