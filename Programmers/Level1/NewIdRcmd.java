import java.util.StringTokenizer;

class Solution {
    public String solution(String new_id) {
        StringBuilder sb = new StringBuilder();
        
        new_id = new_id.toLowerCase();
        new_id = new_id.replaceAll("[^0-9a-z-_.]", "");
        
        StringTokenizer st = new StringTokenizer(new_id, ".");
        
        while (st.hasMoreTokens()) {
            sb.append(st.nextToken());
            sb.append(".");
        }
        
        if (sb.length() != 0) sb.deleteCharAt(sb.lastIndexOf("."));

        new_id = String.valueOf(sb);

        if (new_id.equals("")) new_id = "a";
        if (new_id.length() > 15) {
            new_id = new_id.substring(0, 15);

            if (new_id.charAt(new_id.length() - 1) == '.') new_id = new_id.substring(0, 14);
        } else if (new_id.length() < 3) {
            sb = new StringBuilder();
            sb.append(new_id);

            while (sb.length() < 3) {
                sb.append(new_id.charAt(new_id.length() - 1));
            }

            new_id = String.valueOf(sb);
        }
        
        String answer = new_id;
        return answer;
    }
}