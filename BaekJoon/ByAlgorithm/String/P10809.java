public class P10809 {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[26];
        int c, i;

        for (i = 25; i > -1; i--) {
            arr[i] = -1;
        }

        while ((c = System.in.read() - 97) > -1) {
            i++;

            if (arr[c] == -1) {
                arr[c] = i;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (i = 0; i < 26; i++) {
            sb.append(arr[i]).append(' ');
        }

        System.out.print(sb);
    }
}