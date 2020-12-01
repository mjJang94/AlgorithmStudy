import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());


        for (int i = 0; i < N; i++) {

            for (int j = 0; j <= i; j++) {

                stringBuilder.append("*");
            }
            stringBuilder.append('\n');
        }

        bufferedReader.close();
        System.out.println(stringBuilder);

    }
}
