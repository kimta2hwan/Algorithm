public class P6588 {
    public static void main(String[] args) throws Exception {
        int n;
        boolean[] prime = new boolean[1000001];
        prime[0] = prime[1] = true;

        for (int i = 2; i * i < 1000001; i++) {
            if (!prime[i]) {
                for (int j = i * i; j < 1000001; j += i) {
                    prime[j] = true;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        while ((n = read()) != 0) {
            boolean bool = false;

            for (int i = n - 1; i > 1; i--) {
                if (!prime[i] && !prime[n - i]) {
                    sb.append(n).append(" = ").append(n-i).append(" + ").append(i).append('\n');
                    bool = true;
                    break;
                }
            }

            if (!bool) {
                sb.append("Goldbach's conjecture is wrong.");
            }
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