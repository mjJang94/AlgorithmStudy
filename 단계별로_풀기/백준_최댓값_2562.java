import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder stringBuilder = new StringBuilder();

        int[] arr = new int[9];
        int max = 0;
        int index = 0;
        int routineCount = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }

        for (int value : arr) {

            routineCount++;

            if (max < value) {
                max = value;
                index = routineCount;
            }
        }


        stringBuilder.append(max).append('\n').append(index);

        System.out.println(stringBuilder);

    }
}
