import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class P1406 {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[600000];
        int l_cursor = 0, r_cursor = arr.length - 1;
        
        int M = 0, c;

        while ((c = System.in.read()) > 13) {
            arr[l_cursor++] = c;
        }

        if (c == 13) {
            System.in.read();
        }
        
        while ((c = System.in.read()) > 47) {
            M = (M << 3) + (M << 1)+(c & 15);
        }

        if (c == 13) {
            System.in.read();
        }
        
        while (M-- > 0) {
            switch (System.in.read()) {
                case 'L':
                    if (l_cursor > 0) {
                        l_cursor--;
                        arr[r_cursor] = arr[l_cursor];
                        r_cursor--;
                    }

                    break;

                case 'D':
                    if (r_cursor < 599999) {
                        r_cursor++;
                        arr[l_cursor] = arr[r_cursor];
                        l_cursor++;
                    }

                    break;

                case 'B':
                    if(l_cursor > 0) {
                        l_cursor--;
                    }

                    break;

                default:
                    System.in.read();
                    arr[l_cursor++] = System.in.read();
            }

            while ((c = System.in.read()) != 10) {};
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < l_cursor; i++) {
            bw.write(arr[i]);
        }

        for(int i = r_cursor + 1; i < 600000; i++) {
            bw.write(arr[i]);
        }

        bw.flush();
        bw.close();
    }
}