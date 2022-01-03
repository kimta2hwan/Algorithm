import java.io.*;

public class Basic1067 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());

        bw.write(num > 0 ? "plus" : "minus");
        bw.newLine();
        bw.write(Math.floorMod(num, 2) == 0 ? "even" : "odd");

        bw.flush();
        bw.close();
    }
}