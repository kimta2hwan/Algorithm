import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Basic1019 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ".");

        int year = Integer.valueOf(st.nextToken());
        int month = Integer.valueOf(st.nextToken());
        int day = Integer.valueOf(st.nextToken());

        System.out.printf("%04d.%02d.%02d", year, month, day);
    }
}