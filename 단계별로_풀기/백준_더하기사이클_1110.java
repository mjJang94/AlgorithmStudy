import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        int tmpValue = N;
        int cycle = 0;

        while (true) {

            //사이클 수 증가
            cycle++;

            N = (((N % 10) * 10) + ((N / 10) + (N % 10)) % 10);

            if (N == tmpValue) {
                System.out.println(cycle);
                break;
            }
        }
    }
}
