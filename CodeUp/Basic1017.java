import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Basic1017 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int i = Integer.valueOf(br.readLine());

        sb.append(i);
        sb.append(" ");
        sb.append(i);
        sb.append(" ");
        sb.append(i);

        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}