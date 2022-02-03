public class Recursion {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.print(fib(i) + ", ");
        }
    }

    static int fib(int num) {
        if (num < 3) {
            return 1;
        } else {
            return fib(num - 2) + fib(num - 1);
        }
    }
}