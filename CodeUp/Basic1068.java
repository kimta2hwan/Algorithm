import java.io.*;

public class Basic1068 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int score = Integer.parseInt(br.readLine());

        if (score >= 90) bw.write("A");
        else if (score >= 70) bw.write("B");
        else if (score >= 40) bw.write("C");
        else bw.write("D");

        bw.flush();
        bw.close();
    }
}