public class P10872 {
    public static void main(String[] args) throws Exception {
        long c, N = System.in.read() & 15;

        while ((c = System.in.read()) > 32) {
            N = (N << 3) + (N << 1) + (c & 15);
        }

        if (c == 13) {
            System.in.read();
        }

        if (N == 0) {
            System.out.print(0);
        } else {
            c = N;

            while (N-- > 1) {
                c *= N;
            }

            System.out.print(c);
        }
    }   
}