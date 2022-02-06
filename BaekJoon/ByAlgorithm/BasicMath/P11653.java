public class P11653 {
    public static void main(String[] args) throws Exception {
        int N = read();

        StringBuilder sb = new StringBuilder();

        for (int i = 2; i * i <= N; i++) {
            while (N % i == 0) {
                N /= i;
                sb.append(i).append('\n');
            }
        }

        if (N != 1) {
            sb.append(N);
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