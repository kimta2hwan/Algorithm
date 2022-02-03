public class P10824 {
    public static void main(String[] args) throws Exception {
        long[] arr = new long[2];
        int c;

        for (int i = 0; i < 2; i++) {
            arr[i] = System.in.read() & 15;

            for (int j = 0; j < 2; j++) {
                while ((c = System.in.read()) > 32) {
                    arr[i] = (arr[i] << 3) + (arr[i] << 1) + (c & 15);
                }
            }
        }

        System.out.print(arr[0] + arr[1]);
    }
}