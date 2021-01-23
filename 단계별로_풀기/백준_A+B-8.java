import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());


        for (int i = 0; i < N ; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            String left = stringTokenizer.nextToken();
            String right = stringTokenizer.nextToken();

            stringBuilder
                    .append("Case #" + (i+1) +": " + left + " + " + right + " = ")
                    .append(Integer.parseInt(left) + Integer.parseInt(right))
                    .append('\n');
        }

        bufferedReader.close();

        System.out.println(stringBuilder);
    }
}
