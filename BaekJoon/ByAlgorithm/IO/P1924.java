import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class P1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] day = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int index = (day[x - 1] + y) % 7;

        switch (index) {
            case 0 : bw.write("SUN"); break;
            case 1 : bw.write("MON"); break;
            case 2 : bw.write("TUE"); break;
            case 3 : bw.write("WED"); break;
            case 4 : bw.write("THU"); break;
            case 5 : bw.write("FRI"); break;
            case 6 : bw.write("SAT"); break;
        }

        bw.flush();
        
        br.close();
        bw.close();
    }
}