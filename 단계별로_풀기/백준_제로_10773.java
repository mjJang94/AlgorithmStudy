import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int[] stack;
    private static int size = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(bufferedReader.readLine());
        stack = new int[K];
        int result = 0;

        while (K-- > 0) {
            int tmp = Integer.parseInt(bufferedReader.readLine());

            if (tmp == 0) {
                stack[size - 1] = 0;
                size--;
            } else {
                stack[size] = tmp;
                size++;
            }
        }

        for (int value : stack){
            result += value;
        }

        System.out.println(result);
    }
}
