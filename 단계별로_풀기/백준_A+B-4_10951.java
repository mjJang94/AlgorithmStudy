import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        String tmpValue;


        while ((tmpValue = bufferedReader.readLine()) != null) {

            StringTokenizer stringTokenizer = new StringTokenizer(tmpValue, " ");

            int A = Integer.parseInt(stringTokenizer.nextToken());
            int B = Integer.parseInt(stringTokenizer.nextToken());

            stringBuilder.append(A + B).append('\n');
        }

        System.out.println(stringBuilder);

    }

}
