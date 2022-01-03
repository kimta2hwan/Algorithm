import java.io.*;

public class Basic1034 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(Integer.valueOf(br.readLine(), 8).toString());
        
        bw.flush();
        bw.close();
    }
}