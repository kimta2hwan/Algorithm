public class TopDown {
    static int[] dp = new int[10];

    public static void main(String[] args) {
        dp[1] = dp[2] = 1;

        for (int i = 1; i < 10; i++) {
            System.out.print(topDown(i) + ", ");
        }
    }

    static int topDown(int num) {
        if (dp[num] > 0) {
            return dp[num];
        } else {
            dp[num] = topDown(num - 1) + topDown(num - 2);
        }

        return dp[num];
    }
}