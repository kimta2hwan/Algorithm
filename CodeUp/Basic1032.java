import java.io.*;

public class Basic1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(Integer.toHexString(Integer.valueOf(br.readLine())));
        
        bw.flush();
        bw.close();
    }
}