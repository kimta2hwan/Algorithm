import java.util.PriorityQueue;

public class P11656 {
    public static void main(String[] args) throws Exception {
        StringBuilder str = new StringBuilder();
        int c;
        
        while ((c = System.in.read()) > 32) {
            str.append((char)c);
        }

        PriorityQueue<String> pq = new PriorityQueue<>();

        for (int i = 0; i < str.length(); i++) {
            pq.add(str.substring(i));
        }

        StringBuilder sb = new StringBuilder();

        while (!pq.isEmpty()) {
            sb.append(pq.poll()).append('\n');
        }

        System.out.print(sb);
    }
}