import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int result = 0;
        for (int i = 1; i < N + 1; i++) {
            result += i;
        }

        System.out.println(result);
    }
}
