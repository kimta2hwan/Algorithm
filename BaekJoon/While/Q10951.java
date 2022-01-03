import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Q10951 {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str;

		while((str = br.readLine()) != null ) {
            st = new StringTokenizer(str," ");

			int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            
			sb.append(A + B).append("\n");
		
		}
		System.out.print(sb);
	}
}