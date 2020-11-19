import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        System.out.println(getNumberOfBag(N));
    }

    static int getNumberOfBag(int n) {

        if (n == 4 || n == 7) {
            return -1;
        } else if (n % 5 == 0) {
            return (n / 5);
        } else if (n % 5 == 1 || n % 5 == 3) {
            return (n / 5) + 1;
        } else if (n % 5 == 2 || n % 5 == 4) {
            return (n / 5) + 2;
        }

        return -1;
    }
}
