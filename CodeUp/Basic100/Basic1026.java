import java.io.*;
import java.util.StringTokenizer;

public class Basic1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");

        st.nextToken();

        bw.write(Integer.valueOf(st.nextToken()).toString());
        
        bw.flush();
        bw.close();
    }
}