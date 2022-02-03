public class P2743 {
    public static void main(String[] args) throws Exception {
        int count = 0;

        while (System.in.read() > 64) {
            count++;
        }

        System.out.print(count);
    }
}