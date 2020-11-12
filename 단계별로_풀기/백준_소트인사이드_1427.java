import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    /**
     * 문제
     * 배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
     * <p>
     * 입력
     * 첫째 줄에 정렬하고자하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.
     * <p>
     * 출력
     * 첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        br.close();

        StringBuilder stringBuilder = new StringBuilder();
        int size = N.length();

        Integer[] arr = new Integer[size];

        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(String.valueOf(N.charAt(i)));
        }

        Arrays.sort(arr, Comparator.reverseOrder());

        for (int value : arr) {
            stringBuilder.append(value);
        }

        System.out.println(stringBuilder);
    }
}
