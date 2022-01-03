import java.io.*;

public class Basic1029 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(String.format("%.11f", Double.valueOf(br.readLine())));
        
        bw.flush();
        bw.close();
    }
}