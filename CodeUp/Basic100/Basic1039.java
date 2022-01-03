import java.io.*;
import java.util.StringTokenizer;

public class Basic1039 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String str1 = st.nextToken();
        String str2 = st.nextToken();

        long result = Long.valueOf(str1) + Long.valueOf(str2);

        bw.write(Long.toString(result));
        
        bw.flush();
        bw.close();
    }
}