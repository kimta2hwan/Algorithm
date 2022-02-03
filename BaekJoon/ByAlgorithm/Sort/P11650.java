import java.util.Arrays;

public class P11650 {
    public static void main(String[] args) throws Exception {
        int N = read();
        int map[][] = new int[N][2];

        for (int i = 0; i < N; i++) {
            map[i][0] = read();
            map[i][1] = read();
        }

        Arrays.sort(map, (e1, e2) -> {
            if (e1[0] == e2[0]) {
                return e1[1] - e2[1];
            }

            return e1[0] - e2[0];
        });

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            sb.append(map[i][0]).append(' ').append(map[i][1]).append('\n');
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