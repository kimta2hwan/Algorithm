import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Basic1007 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        bw.write("\"C:\\Download\\hello.cpp\"");
        
        bw.flush();
        bw.close();
    }
}