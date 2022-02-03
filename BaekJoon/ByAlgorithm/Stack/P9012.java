public class P9012 {
    public static void main(String[] args) throws Exception {
        int T = readInt();
        int c;

        StringBuilder arr = new StringBuilder();
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            arr = readChar();
            c = 0;

            for (int i = 0; i < arr.length(); i++) {
                if (arr.charAt(i) == '(') {
                    c++;
                } else {
                    c--;
                }

                if (c < 0) {
                    break;
                }
            }

            if (c == 0) {
                sb.append("YES").append('\n');
            } else {
                sb.append("NO").append('\n');
            }
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