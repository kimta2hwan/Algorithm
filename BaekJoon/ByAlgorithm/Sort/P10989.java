public class P10989 {
    public static void main(String[] args) throws Exception {
        int N = read();
        int arr[] = new int[10001];

        while (N-- > 0) {
            arr[read()]++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10001; i++) {
            while (arr[i] > 0) {
                sb.append(i).append('\n');
                arr[i]--;
            }
        }

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