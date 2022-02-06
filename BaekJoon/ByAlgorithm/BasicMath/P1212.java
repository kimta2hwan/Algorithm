public class P1212 {
    public static void main(String[] args) throws Exception {
        StringBuilder str = read();
        String[] first = {"0", "1", "10", "11", "100", "101", "110", "111"};
        String[] temp = {"000", "001", "010", "011", "100", "101", "110", "111"};

        StringBuilder sb = new StringBuilder();
        sb.append(first[str.charAt(0) & 15]);

        for (int i = 1; i < str.length(); i++) {
            sb.append(temp[str.charAt(i) & 15]);
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