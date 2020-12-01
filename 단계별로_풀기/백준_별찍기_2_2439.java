import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < N; i++) {


            for (int j = 1; j < N - i; j++) {
                stringBuilder.append(' ');
            }

            for (int k = 0; k <= i; k++) {
                stringBuilder.append('*');
            }

            stringBuilder.append('\n');
        }

        bufferedReader.close();

        System.out.println(stringBuilder);
    }
}
