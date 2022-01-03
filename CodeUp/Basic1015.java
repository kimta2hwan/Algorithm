import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Basic1015 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        double d = Double.valueOf(br.readLine());

        System.out.printf("%.2f", d);
    }
}