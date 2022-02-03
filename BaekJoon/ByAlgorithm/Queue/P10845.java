import java.io.IOException;

public class P10845 {
    public static void main(String[] args) throws IOException{
        StringBuilder sb = new StringBuilder();
        int N = read_int();
        int[] queue = new int[N];
        queue[0] = -1;
        int front = 0;
        int back = 0;
        while(N-->0){
            int cmd = read_char();
            int size = back-front;
            switch(cmd){
                case 'p'+'u': 
                    queue[back++] = read_int();
                    break;
                case 'p'+'o':
                    if(size==0) sb.append(-1).append("\n");
                    else sb.append(queue[front++]).append("\n");
                    break;
                case 's'+'i':
                    sb.append(size).append("\n");
                    break;
                case 'e'+'m':
                    if(size==0) sb.append("1").append("\n");
                    else sb.append("0").append("\n");
                    break;
                case 'f'+'r':
                    if(size==0) sb.append(-1).append("\n");
                    else sb.append(queue[front]).append("\n");
                    break;
                default:
                    if(size==0) sb.append(-1).append("\n");
                    else sb.append(queue[back-1]).append("\n");
            }

        }
        System.out.print(sb.toString());
    }
    
    static int read_int() throws IOException{
        int N = 0, c;
        while((c=System.in.read())>47) N = (N<<3)+(N<<1)+(c&15);
        if(c==13) System.in.read();
        return N;
    }
    
    static int read_char() throws IOException{
        int c, N = System.in.read()+System.in.read();
        while((c=System.in.read())>96);
        if(c==13) System.in.read();
        return N;
    }
}