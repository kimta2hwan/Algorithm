public class P2745 {
    public static void main(String[] args) throws Exception {
        StringBuilder str = new StringBuilder();
        str = readChar();
        int B = readInt();

        System.out.print(Integer.parseInt(String.valueOf(str), B));
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