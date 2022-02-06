import java.util.ArrayList;

public class P1158 {
    public static void main(String[] args) throws Exception {
        int N = read();
        int K = read();
        int num = K - 1;

        ArrayList<Integer> list = new ArrayList<>();
        int[] resultArray = new int[N];

        for (int i = 0; i < N; i++) {
            list.add(i + 1);
        }

        int remove = list.remove(num);
        int index = 0;

        StringBuilder sb = new StringBuilder();

        while (list.size() > 0) {
            resultArray[index++] = remove;

            K += num;

            while (K > list.size()) {
                K -= list.size();
            }

            remove = list.remove(K - 1);
        }

        resultArray[N - 1] = remove;

        sb.append('<').append(resultArray[0]);

        for (int i = 1; i < resultArray.length; i++) {
            sb.append(", ").append(resultArray[i]);
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