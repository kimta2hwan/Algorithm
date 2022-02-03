public class P10828 {
    public static int[] stack;
    public static int size = 0;

    public static void main(String[] args) throws Exception {
        int N = readInt();
        stack = new int[N];

        StringBuilder sb = new StringBuilder();

        while (N-- > 0) {
            String command = String.valueOf(readChar());

            switch (command) {
                case "push":
                    push(readInt());
                    break;

                case "pop":
                    sb.append(pop()).append('\n');
                    break;

                case "size":
                    sb.append(size()).append('\n');
                    break;

                case "empty":
                    sb.append(empty()).append('\n');
                    break;

                case "top":
                    sb.append(top()).append('\n');
                    break;
            }
        }

        System.out.print(sb);
    }

    public static void push(int X) {
        stack[size] = X;
        size++;
    }

    public static int pop() {
        if (size == 0) {
            return -1;
        } else {
            int res = stack[size - 1];
            stack[size - 1] = 0;
            size--;
            return res;
        }
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if (size == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int top() {
        if (size == 0) {
            return -1;
        } else {
            return stack[size - 1];
        }
    }

    public static int readInt() throws Exception {
        int c, n = System.in.read() & 15;

        while ((c = System.in.read()) > 32) {
            n = (n << 3) + (n << 1) + (c & 15);
        }

        if (c == 13) {
            System.in.read();
        }

        return n;
    }

    public static StringBuilder readChar() throws Exception {
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