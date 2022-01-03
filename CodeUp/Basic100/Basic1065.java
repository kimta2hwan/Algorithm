import java.io.*;
import java.util.StringTokenizer;

public class Basic1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[3];

        for (int i = 0; i < 3; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        for (int i : nums) {
            if (i % 2 == 0) {
                bw.write(String.valueOf(i));
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }
}