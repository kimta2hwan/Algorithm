public class P10808 {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[26];
        int c;

        while ((c = System.in.read()) > 96) {
            arr[c - 97]++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            sb.append(arr[i]).append(' ');
        }

        System.out.print(sb);
    }
}