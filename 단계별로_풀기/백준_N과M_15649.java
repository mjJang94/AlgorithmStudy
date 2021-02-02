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

        if (depth == M){ //최대수인 4까지 탐색한 경
            for (int tmp: arr){ //배열에 있는 데이터들을 꺼내서 출력한다.
                buffer.append(tmp).append(' ');
            }
            buffer.append('\n'); //줄바꿈
            return; //for문으로 돌아가기
        }

        for (int i=0; i< N; i++){
            if (!visit[i]){ //탐색하지 않은 경우이면 조건문 실행
                visit[i] = true; //false -> true로 바꿔줌
                arr[depth] = i + 1; //데이터 담기
                dfs(depth + 1); //재귀 호출
                visit[i] = false;
            }
        }
    }
}
