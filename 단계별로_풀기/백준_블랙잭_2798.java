import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    /**
     * N: 5
     * M: 21
     * <p>
     * 5 21
     * 5 6 7 8 9
     */
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(tokenizer.nextToken());
        int M = Integer.parseInt(tokenizer.nextToken());

        int[] arr = new int[N];

        tokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
        }


        int result = search(arr, N, M);
        System.out.println(result);

    }

    static int search(int[] arr, int N, int M) {
        int result = 0;

        // 3장만 고름
        for (int i = 0; i < N - 2; i++) {

            // 첫번째 고른카드 바로 앞카드부터 순회
            for (int j = i + 1; j < N - 1; j++) {

                // 두번째 고른카드 바로 앞카드부터 순
                for (int k = j + 1; k < N; k++) {

                    // 뽑은 카드들의 합
                    int tmp = arr[i] + arr[j] + arr[k];

                    // 기준값과 뽑은 카드들의 합이 똑같으면 바로 리턴
                    if (M == tmp) {
                        return tmp;
                    }

                    // 저장된 반환할 값이 3장의 카드의 합 보다 작고, 기준값을 넘기지 않으면 반환값 갱신
                    if (result < tmp && tmp < M) {
                        result = tmp;
                    }
                }
            }
        }
        return result;
    }
}
