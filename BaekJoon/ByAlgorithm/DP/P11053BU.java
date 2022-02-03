import java.io.IOException;

public class P11053BU {
    public static void main(String[] args) throws IOException {
        int N = read();
        int arr[] = new int[N + 1];
        int dp[] = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = read();
        }
    }

    static int read() throws IOException {
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