import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Basic1014 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");

        String a = st.nextToken();
        String b = st.nextToken();

        sb.append(b);
        sb.append(" ");
        sb.append(a);

        bw.write(sb.toString());
        
        bw.flush();
        bw.close();
    }
}