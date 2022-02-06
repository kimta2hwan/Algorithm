public class P1676 {
    public static void main(String[] args) throws Exception {
        int c, N = System.in.read() & 15;

        while ((c = System.in.read()) > 32) {
            N = (N << 3) + (N << 1) + (c & 15);
        }

        if (c == 13) {
            System.in.read();
        }

        int count_5 = 0, count_2 = 0;

        for (int i = 1; i <= N; i++) {
            int num = i;

            while (num % 2 == 0) {
                num /= 2;
                count_2++;
            }

            while (num % 5 == 0) {
                num /= 5;
                count_5++;
            }
        }

        System.out.print(count_5 < count_2 ? count_5 : count_2);
    }
}