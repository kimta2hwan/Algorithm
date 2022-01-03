import java.util.Arrays;

public class Level1 {
    public static void main(String[] args) {
        String s = "Zzbcdefg";
        char[] c = s.toCharArray();

        Arrays.sort(c);

        StringBuilder sb = new StringBuilder(c.toString());
        String result = sb.reverse().toString();

        System.out.println(result);
    }
}