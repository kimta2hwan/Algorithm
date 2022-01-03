import java.io.*;

public class Basic1069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int score = br.read();

        switch (score) {
            case 'A': bw.write("best!!!"); break;
            case 'B': bw.write("good!!"); break;
            case 'C': bw.write("run!"); break;
            case 'D': bw.write("slowly~"); break;
            default: bw.write("what?"); break;
        }

        bw.flush();
        bw.close();
    }
}