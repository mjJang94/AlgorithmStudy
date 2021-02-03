import java.io.IOException;
import java.util.Scanner;

public class Main {

    static int N = 0;
    static int M = 0;
    static int[] arr;
    static StringBuffer stringBuffer = new StringBuffer();

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();
        M = scan.nextInt();
        arr = new int[M];

        dfs(1, 0);

        System.out.println(stringBuffer.toString());
    }

    public static void dfs(int at, int depth) {

        if (depth == M) {
            for (int tmp : arr) {
                stringBuffer.append(tmp).append(' ');
            }
            stringBuffer.append('\n');
            return;
        }

        for (int i = at; i <= N; i++) {
            arr[depth] = i;
            dfs(i + 1, depth + 1);
        }

    }
}
