import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Basic1008 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        sb.append("\u250C\u252C\u2510");
        sb.append("\n");
        sb.append("\u251C\u253C\u2524");
        sb.append("\n");
        sb.append("\u2514\u2534\u2518");
        
        bw.write(sb.toString());
        
        bw.flush();
        bw.close();
    }
}