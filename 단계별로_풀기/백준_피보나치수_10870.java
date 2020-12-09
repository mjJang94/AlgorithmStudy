import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int insert = scanner.nextInt();

        System.out.print(fibonacci(insert));

    }

    public static long fibonacci(long value) {
        if (value == 0) return 0;
        if (value == 1) return 1;

        return fibonacci(value - 1) + fibonacci(value - 2);
    }
}
