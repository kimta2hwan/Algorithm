public class BottomUp {
    static int dp[] = new int [10];

    public static void main(String[] args) {
        dp[1] = dp[2] = 1;

        for (int i = 1; i < 10; i++) {
            if (i == 1 || i == 2) {} 
            else {
                dp[i] = dp[i - 2] + dp[i - 1];
            }

            System.out.print(dp[i] + ", ");
        }
    }
}