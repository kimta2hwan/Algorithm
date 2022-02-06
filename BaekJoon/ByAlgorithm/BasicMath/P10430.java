public class P10430 {
    public static void main(String[] args) throws Exception {
        int A = read();
        int B = read();
        int C = read();

        StringBuilder sb = new StringBuilder();

        sb.append((A + B) % C).append('\n');
        sb.append(((A % C) + (B % C)) % C).append('\n');
        sb.append((A * B) % C).append('\n');
        sb.append(((A % C) * (B % C)) % C).append('\n');

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