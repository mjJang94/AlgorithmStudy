import java.io.IOException;
import java.util.*;

public class Main {

    public static boolean[] visit;
    public static int[] arr;
    public static int N;
    public static int M;
    public static StringBuffer buffer = new StringBuffer();

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        M = scanner.nextInt();

        visit = new boolean[N];
        arr = new int[M];
        dfs(0);
        System.out.println(buffer.toString());
    }

    public static void dfs(int depth) {

        if (depth == M){ 
            for (int tmp: arr){
                buffer.append(tmp).append(' ');
            }
            buffer.append('\n'); 
            return; 
        }

        for (int i=0; i< N; i++){
            if (!visit[i]){ 
                visit[i] = true;
                arr[depth] = i + 1; 
                dfs(depth + 1);
                visit[i] = false;
            }
        }
    }
}
