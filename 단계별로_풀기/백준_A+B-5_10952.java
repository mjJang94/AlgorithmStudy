import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        while (true) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int A = Integer.parseInt(stringTokenizer.nextToken());
            int B = Integer.parseInt(stringTokenizer.nextToken());

            if (A + B == 0) {
                bufferedReader.close();
                System.out.println(stringBuilder);
                break;
            } else {
                stringBuilder.append((A + B)).append('\n');
            }
        }

    }
}
