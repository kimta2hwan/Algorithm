import java.io.*;
import java.util.StringTokenizer;

public class Basic1027 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), ".");
        StringBuilder sb = new StringBuilder();

        String str1 = st.nextToken();
        String str2 = st.nextToken();
        String str3 = st.nextToken();

        sb.append(str3);
        sb.append("-");
        sb.append(str2);
        sb.append("-");
        sb.append(str1);

        bw.write(sb.toString());
        
        bw.flush();
        bw.close();
    }
}