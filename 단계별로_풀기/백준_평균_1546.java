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

        double[] arr = new double[N];

        int index = 0;

        double result = 0;

        while (stringTokenizer.hasMoreTokens()) {
            arr[index] = Double.parseDouble(stringTokenizer.nextToken());
            index++;
        }

        Arrays.sort(arr);

        double max = arr[N - 1];

        for (int i = 0; i < arr.length; i++) {
            result += arr[i] / max * 100;
        }

        System.out.println(result / N);
    }
}
