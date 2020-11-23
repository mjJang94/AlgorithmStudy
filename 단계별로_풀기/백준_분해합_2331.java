import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    /**
     * 입력값: 216
     * <p>
     * 출력값: 198
     */
    public static void main(String[] args) throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        int answer = 0;

        for (int i = 0; i < N; i++) {
            // 한자리씩 뗴어내기 위한 변수
            int value = i;
            // 각 자리의 합을 담을 변수
            int result = 0;

            // 각 자리 모두 분해할때까지 반복
           while (value != 0) {
                result += (value % 10); // 한자리씩 누적
                value /= 10; // 한자리씩 밀어내기 int 라서 소수점 무시
            }
            // i - 반복문으로 증가된 현재값, result - 각 자리수의 합산
            // 입력값과 같으면 for 문 탈출
            if (N == result + i){
                answer = i;
                break;
            }
        }

        System.out.println(answer);

    }
}
