import java.util.PriorityQueue;

public class P10825 {
    public static void main(String[] args) throws Exception {
        PriorityQueue<Score> pq = new PriorityQueue<>();
        int N = readInt();

        while (N-- > 0) {
            String name = String.valueOf(readChar());
            int korean = readInt();
            int english = readInt();
            int math = readInt();

            pq.add(new Score(name, korean, english, math));
        }

        StringBuilder sb = new StringBuilder();

        while(!pq.isEmpty()) {
            sb.append(pq.poll().name).append('\n');
        }

        System.out.print(sb);
    }

    private static int readInt() throws Exception {
        int c, n = System.in.read() & 15;

        while ((c = System.in.read()) > 32) {
            n = (n << 3) + (n << 1) + (c & 15);
        }

        if (c == 13) {
            System.in.read();
        }

        return n;
    }

    private static StringBuilder readChar() throws Exception {
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

    private static class Score implements Comparable<Score> {
        String name;
        int korean;
        int english;
        int math;

        Score(String name, int korean, int english, int math) {
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
        }

        @Override
        public int compareTo(Score s) {
            if (s.korean == korean) {
                if (s.english == english) {
                    if (s.math == math) {
                        return name.compareTo(s.name);
                    }

                    return s.math - math;
                }

                return english - s.english;
            }

            return s.korean - korean;
        }
    }
}