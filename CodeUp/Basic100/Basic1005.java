import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Basic1005 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        bw.write("\"Hello\"");
        
        bw.flush();
        bw.close();
    }
}