public class P11004 {
    public static void main(String[] args) throws Exception {
        int N = read();
        int K = read();
        int board[] = new int[N];
        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;

        for (int i = 0  ; i < N ; i++) {
            board[i] = read();
            
            if (board[i] < left) {
                left = board[i];
            }

            if (board[i] > right) {
                right = board[i];
            }
        }

        int ans = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            int count = 0;

            for (int i = 0 ; i < N ; i++) {
                if (board[i] <= mid) {
                    count++;
                }
            }

            if (count >= K) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }

        System.out.print(ans);
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