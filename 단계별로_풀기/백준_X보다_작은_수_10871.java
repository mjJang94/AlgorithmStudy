import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder stringBuilder = new StringBuilder();

        StringTokenizer firstLine = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(firstLine.nextToken());
        int number = Integer.parseInt(firstLine.nextToken());

        StringTokenizer secondLine = new StringTokenizer(bufferedReader.readLine());

        bufferedReader.close();

        for (int i = 0; i < N; i++) {

            int tmpValue = Integer.parseInt(secondLine.nextToken());

            if (tmpValue < number) {
                stringBuilder.append(tmpValue).append(" ");
            }
        }


        System.out.println(stringBuilder);
    }
}
