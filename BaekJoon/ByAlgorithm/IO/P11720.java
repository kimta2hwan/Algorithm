import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        for (int i = 0; i < N; i++) {
            sum += Character.getNumericValue(str.charAt(i));
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        
        br.close();
        bw.close();
    }
}