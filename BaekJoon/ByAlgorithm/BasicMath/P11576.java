import java.util.ArrayList;
import java.util.Collections;

public class P11576 {
    public static void main(String[] args) throws Exception {
        int A = read();
        int B = read();
        int m = read();

        int num = 0;

        for (int i = 0; i < m; i++) {
            int temp = read();
            num *= A;
            num += temp;
        }

        ArrayList<Integer> arr = new ArrayList<>();

        while (num > 0) {
            arr.add(num % B);
            num /= B;
        }

        Collections.reverse(arr);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.size(); i++) {
            sb.append(arr.get(i)).append(' ');
        }

        System.out.print(sb);
    }

    private static int read() throws Exception {
        int c, n = System.in.read() & 15;

        while ((c = System.in.read()) > 32) {
            n = (n << 3) + (n << 1) + (c & 15);
        }

        if (c == 13) {
            System.in.read();
        }

        return n;
    }
}