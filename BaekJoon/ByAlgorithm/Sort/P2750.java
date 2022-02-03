public class P2750 {
    public static void main(String[] args) throws Exception {
        int N = read();
        int arr[] = new int[2001];

        while (N-- > 0) {
            arr[read() + 1000]++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 2001; i++) {
            if (arr[i] > 0) {
                sb.append(i - 1000).append('\n');
            }
        }

        System.out.print(sb);
    }

    private static int read() throws Exception {
        int c, n = System.in.read() & 15;
        boolean isNegative = n == 13;

        if (isNegative) {
            n = System.in.read() & 15;
        }

        while ((c = System.in.read()) > 32) {
            n = (n << 3) + (n << 1) + (c & 15);
        }

        if (c == 13) {
            System.in.read();
        }

        return isNegative ? ~n + 1 : n;
    }
}