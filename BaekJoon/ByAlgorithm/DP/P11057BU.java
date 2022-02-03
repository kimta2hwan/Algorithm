import java.io.IOException;

public class P11057BU {
    public static void main(String[] args) throws IOException {
        int n = read();
        long sum = 10;
        long[][] d =  new long[n+1][10];
        for(int i = 0; i <= 9 ; i++){
            d[1][i] = 1;
        }
        for(int i = 2; i <= n ; i++){

            d[i][0] = sum % 10007;
            sum = d[i][0];
            d[i][9] = 1;
            sum++;
            for(int j = 8; j>=1; j--){
                d[i][j] = d[i-1][j]+ d[i][j+1] % 10007 ;
                sum += d[i][j];
            }
        }

        long cnt = 0;
        for(int i = 0; i <= 9 ; i++){
            cnt += d[n][i];
        }
        System.out.println(cnt%10007);
    }

    private static int read() throws IOException {
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