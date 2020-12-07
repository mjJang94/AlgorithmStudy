import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        int[] arr = new int[N];

        int arrayIndex = 0;

        while (stringTokenizer.hasMoreTokens()) {
            arr[arrayIndex] = Integer.parseInt(stringTokenizer.nextToken());
            arrayIndex++;
        }

        bufferedReader.close();

        Arrays.sort(arr);

        stringBuilder.append(arr[0]).append(" ").append(arr[N - 1]);
        System.out.println(stringBuilder);
    }
}
