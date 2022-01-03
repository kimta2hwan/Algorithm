import java.io.*;

public class Basic1076 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int c = br.read();
        char i = 'a';

        do {
            sb.append(i);
            sb.append(" ");
            i++;
        } while (i != c + 1);

        bw.write(String.valueOf(sb));
        
        bw.flush();
        bw.close();
    }
}