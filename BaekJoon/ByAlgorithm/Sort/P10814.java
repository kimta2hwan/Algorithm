public class P10814 {
    public static void main(String[] args) throws Exception {
        int N = readInt();
        StringBuilder[] p = new StringBuilder[201];

        for (int i = 0; i < 201; i++) {
            p[i] = new StringBuilder();
        }

        while (N-- > 0) {
            int age = readInt();
            p[age].append(age).append(' ').append(String.valueOf(readChar())).append('\n');
        }

        StringBuilder sb = new StringBuilder();

        for (StringBuilder val : p) {
            sb.append(val);
        }

        System.out.print(sb);
    }

    private static int readInt() throws Exception {
        int c, n = System.in.read() & 15;

        while ((c = System.in.read()) > 32) {
            n = (n << 3) + (n << 1) + (c & 15);
        }

        if (c == 13) {
            System.in.read();
        }

        return n;
    }

    private static StringBuilder readChar() throws Exception {
        StringBuilder sb = new StringBuilder();
        int c;

        sb.append((char)System.in.read());

        while ((c = System.in.read()) > 32) {
            sb.append((char)c);
        }

        if (c == 13) {
            System.in.read();
        }

        return sb;
    }
}