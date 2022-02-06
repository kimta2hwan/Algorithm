public class P11005 {
    public static void main(String[] args) throws Exception {
        int N = read();
        int B = read();

        StringBuilder sb = new StringBuilder();

        while (N > 0) {
            int i = N % B;

            if (i < 10) {
                sb.append(i);
            } else {
                sb.append((char)(i + 55));
            }

            N /= B;
        }

        System.out.print(sb.reverse());
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