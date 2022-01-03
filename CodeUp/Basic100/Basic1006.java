import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Basic1006 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        bw.write("\"!@#$%^&*()\"");
        
        bw.flush();
        bw.close();
    }
}