import java.util.ArrayList;

public class P1168 {
    public static void main(String[] args) throws Exception {
        int N = read();
        int K = read();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        int index = K - 1;

        StringBuilder sb = new StringBuilder();
        sb.append('<');

        while (true) {
            sb.append(list.get(index));
            list.remove(index);

            if (list.size() == 0) {
                break;
            }

            sb.append(',').append(' ');

            index += K - 1;
            index %= list.size();
        }

        sb.append('>');
        
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