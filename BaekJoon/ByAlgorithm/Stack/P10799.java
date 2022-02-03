public class P10799 {
    public static void main(String[] args) throws Exception {
        StringBuilder arr = read();
        int count = 0;
        int left = 0;

        for (int i = 0; i < arr.length(); i++) {
            if (arr.charAt(i) == '(') {
                while (arr.charAt(i) != ')') {
                    i++;
                    left++;
                }

                left--;
                count += left;
                continue;
            }

            if (arr.charAt(i) == ')') {
                left--;
                count++;
            }
        }

        System.out.print(count);
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