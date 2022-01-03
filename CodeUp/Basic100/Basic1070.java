import java.io.*;

public class Basic1070 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int month = Integer.parseInt(br.readLine());

        switch (month) {
            case 3:
            case 4:
            case 5: bw.write("spring"); break;
            case 6:
            case 7:
            case 8: bw.write("summer"); break;
            case 9:
            case 10:
            case 11: bw.write("fall"); break;
            default: bw.write("winter"); break;
        }

        bw.flush();
        bw.close();
    }
}