public class P11655 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        int c;

        while ((c = System.in.read()) > 31) {
            if (c == 32) {
                sb.append(' ');
            } else if (c < 58) {
                sb.append(c & 15);
            } else {
                if (c < 91) {
                    sb.append((char)(((c - 52) % 26) + 65));
                } else {
                    sb.append((char)(((c - 84) % 26) + 97));
                }
            }
        }

        System.out.print(sb);
    }
}