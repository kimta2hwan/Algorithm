import java.util.Arrays;

public class P11652 {
    public static void main(String[] args) throws Exception {
        int N = (int)read();
        long arr[] = new long[N];

        for (int i = 0; i < N; i++) {
            arr[i] = read();
        }

        Arrays.sort(arr);

        int cnt = 1;
        long temp = arr[0];
        int max = 1;

        for (int i = 1; i < N; i++) {
            if (arr[i - 1] == arr[i]) {
                cnt++;

                if (cnt > max) {
                    max = cnt;
                    temp = arr[i];
                }
            } else {
                cnt = 1;
            }
        }

        System.out.print(temp);
    }

    private static long read() throws Exception {
        long c, n = System.in.read() & 15;
        boolean isNegative = n == 13;

        if (isNegative) {
            n = System.in.read() & 15;
        }

        while ((c = System.in.read() ) > 32) {
            n = (n << 3) + (n << 1) + (c & 15);
        }

        if (c == 13) {
            System.in.read();
        }

        return isNegative ? ~n + 1 : n;
    }
}