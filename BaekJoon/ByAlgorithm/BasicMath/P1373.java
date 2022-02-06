public class P1373 {
    public static void main(String[] args) throws Exception {
        StringBuilder str = read();
        int len = str.length();

        StringBuilder sb = new StringBuilder();

        if (len % 3 == 1) {
            sb.append(str.charAt(0) - 48);
        } else if (len % 3 == 2) {
            sb.append((str.charAt(0) - 48) * 2 + str.charAt(1) - 48);
        }

        for (int i = len % 3; i < len; i += 3) {
            sb.append((str.charAt(i) - 48) * 4 + (str.charAt(i + 1) - 48) * 2 + (str.charAt(i + 2) - 48));
        }

        System.out.print(sb);
    }

    private static StringBuilder read() throws Exception {
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