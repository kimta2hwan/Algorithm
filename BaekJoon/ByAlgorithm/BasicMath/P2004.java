public class P2004 {
    public static void main(String[] args) throws Exception {
        int n = read();
        int m = read();

        int count5 = count_5(n) - count_5(n - m) - count_5(m);
        int count2 = count_2(n) - count_2(n - m) - count_2(m);

        System.out.print(count5 < count2 ? count5 : count2);
    }

    private static int count_2(int n) {
        int count = 0;

        while (n > 1) {
            count += n / 2;
            n /= 2;
        }

        return count;
    }

    private static int count_5(int n) {
        int count = 0;

        while (n > 4) {
            count += n / 5;
            n /= 5;
        }

        return count;
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