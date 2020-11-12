import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(bufferedReader.readLine());

        int[] aar = new int[size];

        for (int i = 0; i < size; i++){
            aar[i] = Integer.parseInt(bufferedReader.readLine());
        }

        Arrays.sort(aar);

        for (int value: aar){
            stringBuilder.append(value).append('\n');
        }

        System.out.println(stringBuilder);

    }
}
