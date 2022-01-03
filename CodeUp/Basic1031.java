import java.io.*;

public class Basic1031 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(Integer.toOctalString(Integer.valueOf(br.readLine())));
        
        bw.flush();
        bw.close();
    }
}