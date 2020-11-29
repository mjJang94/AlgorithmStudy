import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        StringBuffer stringBuffer = new StringBuffer();
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            arr[i][0] = Integer.parseInt(stringTokenizer.nextToken()); //몸무게
            arr[i][1] = Integer.parseInt(stringTokenizer.nextToken()); //
        }


        for (int i = 0; i < N; i++) {
            int result = 1; //1등부터

            for (int j = 0; j < N; j++) {

                if (i != j) { //같은사람인 경우는 서로 비교하지 않음

                    //i번째 사람과 j번째 사람을 비교하여 i번째가 더 작을경우 덩치 순위를 증가시킴 (입력순으로 첫번째 사람과 뒷사람을 비교)
                    if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                        result++;
                    }
                }
            }
            stringBuffer.append(result).append(" ");
        }

        System.out.println(stringBuffer);
    }
}
