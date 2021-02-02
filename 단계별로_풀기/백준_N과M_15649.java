import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static boolean[] visit;
    public static int[] arr;

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        visit = new boolean[N];
        arr = new int[M];
        dfs(N, M, 0);

    }

    public static void dfs(int N, int M, int depth) {

        if (depth == M){ //최대수인 4까지 탐색한 경
            for (int tmp: arr){ //배열에 있는 데이터들을 꺼내서 출력한다.
                System.out.print(tmp + " ");
            }

            System.out.println(); //줄바꿈
            return; //for문으로 돌아가기
        }

        for (int i=0; i< N; i++){
            if (!visit[i]){ //탐색하지 않은 경우이면 조건문 실행
                visit[i] = true; //false -> true로 바꿔줌
                arr[depth] = i + 1; //데이터 담기
                dfs(N, M, depth + 1); //재귀 호출
                visit[i] = false;
            }
        }
    }
}
